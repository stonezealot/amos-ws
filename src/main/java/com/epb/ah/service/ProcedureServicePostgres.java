package com.epb.ah.service;

import java.math.BigInteger;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.epb.ah.bean.Home;
import com.epb.ah.service.ProcedureResponse;

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

	@Override
	public ProcedureResponseWithCustId eccustSignup(
			final String charset,
			final String orgId,
			final String firstName,
			final String lastName,
			final String email,
			final String phone,
			final String pwd,
			final String addr1,
			final String addr2,
			final String addr3,
			final String city,
			final String country,
			final String postalcode,
			final String ecshopId,
			final String guestRecKey) {

		return new ProcedureResponseWithCustId(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecEditCartInc(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecEditCartDec(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecAddCart(
			final String charset,
			final String orgId,
			final String custId,
			final String guestFlg,
			final String ecshopId,
			final String stkId,
			final String qty,
			final String cashcarry,
			final String installationFlg) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}
}
