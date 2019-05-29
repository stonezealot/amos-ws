package com.epb.amos.service;

import com.epb.amos.bean.Home;

public interface ProcedureService {

	Home epbLogin(
			String userId,
			String pwd);
	

	static final String ERR_CODE_OK = "OK";
}
