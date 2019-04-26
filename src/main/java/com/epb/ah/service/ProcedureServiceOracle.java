package com.epb.ah.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.epb.ah.bean.Home;
import com.epb.ah.service.ProcedureResponse;

@Service
@Profile("oracle")
public class ProcedureServiceOracle
		implements ProcedureService {

	@Override
	public Home eccustLogin(
			final String charset,
			final String orgId,
			final String name,
			final String pwd,
			final String ecshopId,
			final String guestRecKey) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", charset)
				.addValue("v_org_id", orgId)
				.addValue("v_name", name)
				.addValue("v_pwd", pwd)
				.addValue("v_ecshop_id", ecshopId)
				.addValue("v_guest_rec_key", guestRecKey);

		final Map<String, Object> out = this.eccustLoginCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final Home home = new Home();
		home.setCustId((String) out.get("v_cust_id"));
		home.setCustName((String) out.get("v_cust_name"));
		home.setClassId((String) out.get("v_class_id"));

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

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", charset)
				.addValue("v_org_id", orgId)
				.addValue("v_first_name", firstName)
				.addValue("v_last_name", lastName)
				.addValue("v_email", email)
				.addValue("v_phone", phone)
				.addValue("v_pwd", pwd)
				.addValue("v_addr1", addr1)
				.addValue("v_addr2", addr2)
				.addValue("v_addr3", addr3)
				.addValue("v_city", city)
				.addValue("v_country", country)
				.addValue("v_postalcode", postalcode)
				.addValue("v_ecshop_id", ecshopId)
				.addValue("v_guest_rec_key", guestRecKey);

		final Map<String, Object> out = this.eccustSignupCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponseWithCustId response = new ProcedureResponseWithCustId(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"),
				(String) out.get("v_cust_id"),
				(String) out.get("v_cust_name"),
				(String) out.get("v_class_id"));

		return response;
	}

	@Override
	public ProcedureResponse ecEditCartInc(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_rec_key", recKey)
				.addValue("v_org_id", orgId)
				.addValue("v_cust_id", custId)
				.addValue("v_ecshop_id", ecshopId);

		final Map<String, Object> out = this.ecEditCartIncCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}
	
	@Override
	public ProcedureResponse ecEditCartDec(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_rec_key", recKey)
				.addValue("v_org_id", orgId)
				.addValue("v_cust_id", custId)
				.addValue("v_ecshop_id", ecshopId);

		final Map<String, Object> out = this.ecEditCartDecCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
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

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_rec_key", recKey)
				.addValue("v_org_id", orgId)
				.addValue("v_cust_id", custId)
				.addValue("v_ecshop_id", ecshopId)
				.addValue("v_stk_id", stkId)
				.addValue("v_qty", qty);

		final Map<String, Object> out = this.ecEditCartQtyCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
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

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_rec_key", recKey)
				.addValue("v_org_id", orgId)
				.addValue("v_cust_id", custId)
				.addValue("v_ecshop_id", ecshopId)
				.addValue("v_stk_id", stkId)
				.addValue("v_installation", installation);

		final Map<String, Object> out = this.ecEditCartInstallationCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
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

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_rec_key", recKey)
				.addValue("v_org_id", orgId)
				.addValue("v_cust_id", custId)
				.addValue("v_ecshop_id", ecshopId)
				.addValue("v_stk_id", stkId)
				.addValue("v_cashcarry", cashcarry);

		final Map<String, Object> out = this.ecEditCartCashcarrryCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
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

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_org_id", orgId)
				.addValue("v_cust_id", custId)
				.addValue("v_guest_flg", guestFlg)
				.addValue("v_ecshop_id", ecshopId)
				.addValue("v_stk_id", stkId)
				.addValue("v_qty", qty)
				.addValue("v_cashcarry", cashcarry)
				.addValue("v_installation_flg", installationFlg);

		final Map<String, Object> out = this.ecAddCartCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}
	
	@Override
	public ProcedureResponse ecDeleteCart(
			final String charset,
			final String recKey,
			final String orgId,
			final String custId,
			final String ecshopId) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_rec_key", recKey)
				.addValue("v_org_id", orgId)
				.addValue("v_cust_id", custId)
				.addValue("v_ecshop_id", ecshopId);

		final Map<String, Object> out = this.ecDeleteCartCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
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

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_rec_key", recKey)
				.addValue("v_cust_name", custName)
				.addValue("v_email", email)
				.addValue("v_phone", phone)
				.addValue("v_addr1", addr1)
				.addValue("v_addr2", addr2)
				.addValue("v_postalcode", postalcode);

		final Map<String, Object> out = this.eccustUpdateCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}
	
	@Override
	public ProcedureResponse ecChangePassword(
			final String charset,
			final String recKey,
			final String oldPassword,
			final String newPassword) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_rec_key", recKey)
				.addValue("v_old_password", oldPassword)
				.addValue("v_new_password", newPassword);

		final Map<String, Object> out = this.ecChangePasswordCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}
	
	@Override
	public ProcedureResponse ecAddBookmark(
			final String charset,
			final String orgId,
			final String custId,
			final String ecshopId,
			final String stkId) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_org_id", orgId)
				.addValue("v_cust_id", custId)
				.addValue("v_ecshop_id", ecshopId)
				.addValue("v_stk_id", stkId);

		final Map<String, Object> out = this.ecAddBookmarkCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}
	//
	// fields
	//

	private final JdbcTemplate jdbcTemplate;

	private final SimpleJdbcCall eccustLoginCall;
	private final SimpleJdbcCall eccustSignupCall;
	private final SimpleJdbcCall ecEditCartIncCall;
	private final SimpleJdbcCall ecEditCartDecCall;
	private final SimpleJdbcCall ecEditCartQtyCall;
	private final SimpleJdbcCall ecEditCartInstallationCall;
	private final SimpleJdbcCall ecEditCartCashcarrryCall;
	private final SimpleJdbcCall ecAddCartCall;
	private final SimpleJdbcCall ecDeleteCartCall;
	private final SimpleJdbcCall eccustUpdateCall;
	private final SimpleJdbcCall ecChangePasswordCall;
	private final SimpleJdbcCall ecAddBookmarkCall;
	

	//
	// constructor
	//

	@Autowired
	public ProcedureServiceOracle(final JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		this.eccustLoginCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("eccust_login");
		this.eccustSignupCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("eccust_signup");
		this.ecEditCartIncCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_edit_cart_inc");
		this.ecEditCartDecCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_edit_cart_dec");
		this.ecEditCartQtyCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_edit_cart_qty");
		this.ecEditCartInstallationCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_edit_cart_installation");
		this.ecEditCartCashcarrryCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_edit_cart_cashcarry");
		this.ecAddCartCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_add_cart");
		this.ecDeleteCartCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_delete_cart");
		this.eccustUpdateCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("eccust_update");
		this.ecChangePasswordCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_change_password");
		this.ecAddBookmarkCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_ecutl")
				.withProcedureName("ec_change_password");
	}

}
