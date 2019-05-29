package com.epb.amos.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.epb.amos.bean.Home;
import com.epb.amos.service.ProcedureResponse;

@Service
@Profile("postgres")
public class ProcedureServicePostgres
		implements ProcedureService {

	@Override
	public Home epbLogin(
			final String userId,
			final String pwd) {
		
		final Home home = new Home();
		
		home.setResultId("01");
		home.setResult("-");
		home.setCustId("01");
		home.setCustName("-");
		home.setIsadmin("N");
		home.setUserName("-");
		
		return home;
	}

}
