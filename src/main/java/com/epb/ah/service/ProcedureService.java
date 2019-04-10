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

	static final String ERR_CODE_OK = "OK";
}
