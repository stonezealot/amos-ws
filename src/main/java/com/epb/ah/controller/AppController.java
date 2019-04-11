package com.epb.ah.controller;


import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epb.ah.bean.ECSTKInfo;
import com.epb.ah.entity.ECSTK;
import com.epb.ah.entity.Opentable;
import com.epb.ah.repository.EcStockRepository;
import com.epb.ah.repository.OpentableRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AppController {

	//
	// request mappings
	//
	
	@GetMapping("/stocks")
	public ResponseEntity<List<ECSTK>> getECStocks(
			@RequestParam final String orgId) {

		final ECSTK probe = new ECSTK();
		probe.setOrgId(orgId);
		// on optional sectionId
		final List<ECSTK> ecStocks = this.ecStockRepository
				.findAll(
						Example.of(probe),
						Sort.by("stkId"));
		return ResponseEntity.ok(ecStocks);
	}
	
	@GetMapping("/stocks/{recKey}")
	public ResponseEntity<ECSTKInfo> getECStockInfo(
			@PathVariable final BigDecimal recKey){
		final Optional<ECSTK> ecStk = this.ecStockRepository
				.findById(recKey);
		if(!ecStk.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		final ECSTKInfo ecStkInfo = new ECSTKInfo(
				this.getECSTKFromJDBC(recKey));
		
		return ResponseEntity.ok(ecStkInfo);
	}
	

	//
	// private methods
	//

	private ECSTK getECSTKFromJDBC(final BigDecimal recKey) {
		// for situations where procedure (JDBC) has just updated the table
		return this.jdbcTemplate.queryForObject(
				"select * from ECSTK where rec_key = ?",
				new Object[] { recKey },
				BeanPropertyRowMapper.newInstance(ECSTK.class));
	}
	
	//
	// fields
	//

//	private final Log log = LogFactory.getLog(AppController.class);

	private final JdbcTemplate jdbcTemplate;

	private final OpentableRepository opentableRepository;
	
	private final EcStockRepository ecStockRepository;
	


	private final String dateFormatPattern = "yyyy-MM-dd";
	final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
			this.dateFormatPattern);

	//
	// constructor
	//

	@Autowired
	public AppController(
			final JdbcTemplate jdbcTemplate,
			final OpentableRepository opentableRepository,
			final EcStockRepository ecStockRepository) {

		super();

		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		this.opentableRepository = opentableRepository;
		this.ecStockRepository = ecStockRepository;
		
	}

}
