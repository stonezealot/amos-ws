package com.epb.amos.controller;

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

import com.epb.amos.bean.EpbLoginPayload;
import com.epb.amos.bean.Home;
import com.epb.amos.service.ProcedureResponse;
import com.epb.amos.service.ProcedureService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ShellController {

	@PostMapping("/login")
	public ResponseEntity<Home> login(
			@RequestBody final EpbLoginPayload payload) {

		this.log.error("in");
		
		final String userId = payload.getUserId();
		final String pwd = payload.getPwd();
		
		this.log.error("userId = "+userId);

		return ResponseEntity.ok(
				this.procedureService
						.epbLogin(userId, pwd));
	}


	//
	// private methods
	//


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
