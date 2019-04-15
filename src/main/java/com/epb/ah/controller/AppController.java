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

import com.epb.ah.bean.EcstkInfo;
import com.epb.ah.entity.Eccart;
import com.epb.ah.entity.Ecstk;
import com.epb.ah.repository.EcstkRepository;
import com.epb.ah.repository.EccartRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AppController {

	//
	// request mappings
	//
	
	@GetMapping("/stocks")
	public ResponseEntity<List<Ecstk>> getEcstks(
			@RequestParam final String orgId) {

		final Ecstk probe = new Ecstk();
		probe.setOrgId(orgId);
		// on optional sectionId
		final List<Ecstk> ecstks = this.ecstkRepository
				.findAll(
						Example.of(probe),
						Sort.by("stkId"));
		return ResponseEntity.ok(ecstks);
	}
	
	@GetMapping("/stocks/{recKey}")
	public ResponseEntity<EcstkInfo> getEcstkInfo(
			@PathVariable final BigDecimal recKey){
		final Optional<Ecstk> ecstk = this.ecstkRepository
				.findById(recKey);
		if(!ecstk.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		final EcstkInfo ecstkInfo = new EcstkInfo(
				this.getEcstkFromJDBC(recKey));
		
		return ResponseEntity.ok(ecstkInfo);
	}
	
	@GetMapping("/carts")
	public ResponseEntity<List<Eccart>> getEccarts(
			@RequestParam final String custId,
			@RequestParam final String ecshopId){
		
		final List<Eccart> eccarts = this.eccartRepository
				.findByCustIdAndEcshopId(custId, ecshopId);
		
		return ResponseEntity.ok(eccarts);
	}
	

	//
	// private methods
	//

	private Ecstk getEcstkFromJDBC(final BigDecimal recKey) {
		// for situations where procedure (JDBC) has just updated the table
		return this.jdbcTemplate.queryForObject(
				"select * from ECSTK where rec_key = ?",
				new Object[] { recKey },
				BeanPropertyRowMapper.newInstance(Ecstk.class));
	}
	
	//
	// fields
	//

//	private final Log log = LogFactory.getLog(AppController.class);

	private final JdbcTemplate jdbcTemplate;
	
	private final EcstkRepository ecstkRepository;
	private final EccartRepository eccartRepository;
	


	private final String dateFormatPattern = "yyyy-MM-dd";
	final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
			this.dateFormatPattern);

	//
	// constructor
	//

	@Autowired
	public AppController(
			final JdbcTemplate jdbcTemplate,
			final EcstkRepository ecstkRepository,
			final EccartRepository eccartRepository) {

		super();

		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		this.ecstkRepository = ecstkRepository;
		this.eccartRepository = eccartRepository;
		
	}

}
