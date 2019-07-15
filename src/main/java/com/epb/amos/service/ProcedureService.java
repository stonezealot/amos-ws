package com.epb.amos.service;

import com.epb.amos.bean.Home;

public interface ProcedureService {

	Home epbLogins(
			String userId,
			String pwd,
			String pwds);

	static final String ERR_CODE_OK = "OK";
}
