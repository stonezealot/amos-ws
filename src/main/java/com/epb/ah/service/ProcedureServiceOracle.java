package com.epb.ah.service;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.epb.ah.bean.Home;

@Service
@Profile("oracle")
public class ProcedureServiceOracle
		implements ProcedureService {

	@Override
	public Home eccustLogin(
			final String charset,
			final String orgId,
			final String name,
			final String pwd,
			final String ecshopId,
			final String guestRecKey) {
		
		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", charset)
				.addValue("v_org_id", orgId)
				.addValue("v_name", name)
				.addValue("v_pwd", pwd)
				.addValue("v_ecshop_id", ecshopId)
				.addValue("v_guest_rec_key", guestRecKey);
		
		final Map<String, Object> out = this.eccustLoginCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}
		
		final Home home = new Home();
		home.setCustId((String) out.get("v_cust_id"));
		home.setCustName((String) out.get("v_cust_name"));
		home.setClassId((String) out.get("v_class_id"));
		
		return home;
		
	}
	
	//
	// fields
	//
	
	private final JdbcTemplate jdbcTemplate;
	
	private final SimpleJdbcCall eccustLoginCall;
	
	//
	// constructor
	//
	
	@Autowired
	public ProcedureServiceOracle(final JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);
		
		this.eccustLoginCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("eccust_login");
	}
	
	
	
	
	
	
	
}
