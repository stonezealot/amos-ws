package com.epb.ah.service;

import com.epb.ah.bean.Home;

public interface ProcedureService {

	Home eccustLogin(
			String charset,
			String orgId,
			String name,
			String pwd,
			String ecshopId,
			String guestRecKey);
	
	ProcedureResponseWithCustId eccustSignup(
			String charset,
			String orgId,
			String firstName,
			String lastName,
			String email,
			String phone,
			String pwd,
			String addr1,
			String addr2,
			String addr3,
			String city,
			String country,
			String postalcode,
			String ecshopId,
			String guestRecKey);
	
	ProcedureResponse ecEditCartInc(
			String charset,
			String recKey,
			String orgId,
			String custId,
			String ecshopId);

	static final String ERR_CODE_OK = "OK";
}
