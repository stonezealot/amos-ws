package com.epb.amos.controller;

import java.security.MessageDigest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epb.amos.bean.EpbLoginsPayload;
import com.epb.amos.bean.Home;
import com.epb.amos.service.ProcedureService;

@RestController
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@RequestMapping("/api")
public class ShellController {

	@PostMapping("/login")
	public ResponseEntity<Home> login(
			@RequestBody final EpbLoginsPayload payload) {

		this.log.error("in");

		final String userId = payload.getUserId();
		final String pwd = payload.getPwd();
		final String pwds = this.toUserPwd(pwd);

		this.log.info("userId = " + userId);
		this.log.info("pwd = " + pwd);
		this.log.info("pwds = " + pwds);

		return ResponseEntity.ok(
				this.procedureService
						.epbLogins(userId, pwd, pwds));
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

	//
	// constructor
	//

	@Autowired
	public ShellController(
			final ProcedureService procedureService) {

		super();
		this.procedureService = procedureService;
	}
}
