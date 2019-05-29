package com.epb.amos.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.epb.amos.bean.Home;
import com.epb.amos.service.ProcedureResponse;

@Service
@Profile("oracle")
public class ProcedureServiceOracle
		implements ProcedureService {

	@Override
	public Home epbLogin(
			final String userId,
			final String pwd) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_user_id", userId)
				.addValue("v_pwd", pwd);

		final Map<String, Object> out = this.epbLoginCall.execute(in);
		
		if (!"1".equals((String) out.get("v_result_id"))) {
			throw new RuntimeException((String) out.get("v_result"));
		}

		final Home home = new Home();
		home.setResultId((String) out.get("v_result_id"));
		home.setResult((String) out.get("v_result"));
		home.setCustId((String) out.get("v_cust_id"));
		home.setCustName((String) out.get("v_cust_name"));
		home.setIsadmin((String) out.get("v_isadmin"));
		home.setUserName((String) out.get("v_user_name"));

		return home;

	}

	//
	// fields
	//

	private final JdbcTemplate jdbcTemplate;

	private final SimpleJdbcCall epbLoginCall;

	//
	// constructor
	//

	@Autowired
	public ProcedureServiceOracle(final JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		this.epbLoginCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withProcedureName("epb_login");
		
	}

}
