package com.epb.ah.bean;

public class CheckoutBillingPayload {

	private String orgId;
	private String custId;
	private String ecshopId;
	private String addressFlg;
	private String addr1;
	private String addr2;
	private String postalcode;
	private String ewalletRedeem;

	public CheckoutBillingPayload() {
		super();
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getEcshopId() {
		return ecshopId;
	}

	public void setEcshopId(String ecshopId) {
		this.ecshopId = ecshopId;
	}

	public String getAddressFlg() {
		return addressFlg;
	}

	public void setAddressFlg(String addressFlg) {
		this.addressFlg = addressFlg;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getEwalletRedeem() {
		return ewalletRedeem;
	}

	public void setEwalletRedeem(String ewalletRedeem) {
		this.ewalletRedeem = ewalletRedeem;
	}

}
