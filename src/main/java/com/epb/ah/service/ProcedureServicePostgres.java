package com.epb.ah.service;

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
	public ProcedureResponse ecEditCartQty(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId,
			final String stkId,
			final String qty) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecEditCartInstallation(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId,
			final String stkId,
			final String installation) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecEditCartCashcarry(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId,
			final String stkId,
			final String cashcarry) {

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

	@Override
	public ProcedureResponse ecDeleteCart(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse eccustUpdate(
			final String charset,
			final String recKey,
			final String custName,
			final String email,
			final String phone,
			final String addr1,
			final String addr2,
			final String postalcode) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecChangePassword(
			final String charset,
			final String recKey,
			final String oldPassword,
			final String newPassword) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecAddBookmark(
			final String charset,
			final String orgId,
			final String custId,
			final String ecshopId,
			final String stkId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecDeleteBookmark(
			final String charset,
			final String orgId,
			final String custId,
			final String ecshopId,
			final String stkId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecCartCheckout(
			final String charset,
			final String orgId,
			final String custId,
			final String ecshopId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecCartRecalculate(
			final String charset,
			final String orgId,
			final String custId,
			final String ecshopId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecCheckoutDeliveryAction(
			final String charset,
			final String orgId,
			final String custId,
			final String ecshopId,
			final String dlyZoneId,
			final String dlyDate,
			final String timeslotId,
			final String addr1,
			final String addr2,
			final String postalcode,
			final String remark) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse ecCheckoutBillingAction(
			final String charset,
			final String orgId,
			final String custId,
			final String ecshopId,
			final String addressFlg,
			final String addr1,
			final String addr2,
			final String postalcode,
			final String ewalletRedeem) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponseWithOrderDocId ecGenerateOrder(
			final String charset,
			final String orgId,
			final String custId,
			final String ecshopId) {

		return new ProcedureResponseWithOrderDocId(ERR_CODE_OK, "");
	}
}
