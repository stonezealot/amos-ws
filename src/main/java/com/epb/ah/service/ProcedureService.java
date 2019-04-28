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

	ProcedureResponse ecEditCartDec(
			String charset,
			String recKey,
			String orgId,
			String custId,
			String ecshopId);

	ProcedureResponse ecEditCartQty(
			String charset,
			String recKey,
			String orgId,
			String custId,
			String ecshopId,
			String stkId,
			String qty);

	ProcedureResponse ecEditCartInstallation(
			String charset,
			String recKey,
			String orgId,
			String custId,
			String ecshopId,
			String stkId,
			String installation);

	ProcedureResponse ecEditCartCashcarry(
			String charset,
			String recKey,
			String orgId,
			String custId,
			String ecshopId,
			String stkId,
			String cashcarry);

	ProcedureResponse ecAddCart(
			String charset,
			String orgId,
			String custId,
			String guestFlg,
			String ecshopId,
			String stkId,
			String qty,
			String cashcarry,
			String installationFlg);

	ProcedureResponse ecDeleteCart(
			String charset,
			String recKey,
			String orgId,
			String custId,
			String ecshopId);

	ProcedureResponse eccustUpdate(
			String charset,
			String recKey,
			String custName,
			String email,
			String phone,
			String addr1,
			String addr2,
			String postalcode);

	ProcedureResponse ecChangePassword(
			String charset,
			String recKey,
			String oldPassword,
			String newPassword);

	ProcedureResponse ecAddBookmark(
			String charset,
			String orgId,
			String custId,
			String ecshopId,
			String stkId);

	ProcedureResponse ecDeleteBookmark(
			String charset,
			String orgId,
			String custId,
			String ecshopId,
			String stkId);

	ProcedureResponse ecCartCheckout(
			String charset,
			String orgId,
			String custId,
			String ecshopId);

	static final String ERR_CODE_OK = "OK";
}
