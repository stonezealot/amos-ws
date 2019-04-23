package com.epb.ah.controller;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epb.ah.bean.Home;
import com.epb.ah.bean.EccustLoginPayload;
import com.epb.ah.bean.EccustSignupPayload;
import com.epb.ah.entity.Customer;
import com.epb.ah.repository.CustomerRepository;
import com.epb.ah.service.ProcedureResponse;
import com.epb.ah.service.ProcedureResponseWithCustId;
import com.epb.ah.service.ProcedureService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ShellController {

	@PostMapping("/login")
	public ResponseEntity<Home> login(
			@RequestBody final EccustLoginPayload payload) {

		final String orgId = payload.getOrgId();
		final String name = payload.getName();
		final String pwd = payload.getPwd();
		final String ecshopId = payload.getEcshopId();
		final String guestRecKey = payload.getGuestRecKey();

		// convert password
		final String password = this.toUserPwd(pwd);
		return ResponseEntity.ok(
				this.procedureService
						.eccustLogin("en", orgId, name, password, ecshopId, guestRecKey));
	}

	@PostMapping("/register")
	public ResponseEntity<List<Customer>> register(
			@RequestBody final EccustSignupPayload payload) {

		final String password = this.toUserPwd(payload.getPwd());

		final ProcedureResponseWithCustId response = this.procedureService
				.eccustSignup(
						"",
						payload.getOrgId(),
						payload.getFirstName(),
						payload.getLastName(),
						payload.getEmail(),
						payload.getPhone(),
						password,
						payload.getAddr1(),
						payload.getAddr2(),
						payload.getAddr3(),
						payload.getCity(),
						payload.getCountry(),
						payload.getPostalcode(),
						payload.getEcshopId(),
						payload.getGuestRecKey());
		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		final List<Customer> customer = this.customerRepository
				.findByCustIdAndOrgId(response.getCustId(), payload.getOrgId());

		return ResponseEntity.ok(customer);

	}

	//
	// private methods
	//

	private String toUserPwd(final String password) {
		try {
			if (password == null) {
				return null;
			}

			final MessageDigest messageDigest = MessageDigest.getInstance("SHA");
			final byte[] digests = messageDigest.digest(password.getBytes());

			final StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < digests.length; i++) {
				int halfbyte = (digests[i] >>> 4) & 0x0F;
				for (int j = 0; j <= 1; j++) {
					stringBuilder.append(
							((0 <= halfbyte) && (halfbyte <= 9))
									? (char) ('0' + halfbyte)
									: (char) ('a' + (halfbyte - 10)));
					halfbyte = digests[i] & 0x0F;
				}
			}

			return stringBuilder.toString();
		} catch (final Throwable throwable) {
			this.log.error("error converting password", throwable);
			return null;
		}
	}

	//
	// fields
	//
	private final Log log = LogFactory.getLog(ShellController.class);
	private final ProcedureService procedureService;

	private final CustomerRepository customerRepository;

	//
	// constructor
	//

	@Autowired
	public ShellController(
			final ProcedureService procedureService,
			final CustomerRepository customerRepository) {

		super();
		this.procedureService = procedureService;
		this.customerRepository = customerRepository;
	}
}
