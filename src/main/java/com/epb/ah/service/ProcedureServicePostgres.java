package com.epb.ah.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.epb.ah.bean.Home;

@Service
@Profile("postgres")
public class ProcedureServicePostgres
		implements ProcedureService {

	@Override
	public Home eccustLogin(
			final String charset,
			final String orgId,
			final String name,
			final String pwd,
			final String ecshopId,
			final String guestRecKey) {
		final Home home = new Home();
		home.setCustId("01");
		home.setCustName("-");
		home.setClassId("01");
		return home;
	}
}
