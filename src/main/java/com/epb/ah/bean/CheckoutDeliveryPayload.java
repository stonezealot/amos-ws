package com.epb.ah.bean;

public class CheckoutDeliveryPayload {

	private String orgId;
	private String custId;
	private String ecshopId;
	private String dlyZoneId;
	private String dlyDate;
	private String timeslotId;
	private String addr1;
	private String addr2;
	private String postalcode;
	private String remark;

	public CheckoutDeliveryPayload() {
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

	public String getDlyZoneId() {
		return dlyZoneId;
	}

	public void setDlyZoneId(String dlyZoneId) {
		this.dlyZoneId = dlyZoneId;
	}

	public String getDlyDate() {
		return dlyDate;
	}

	public void setDlyDate(String dlyDate) {
		this.dlyDate = dlyDate;
	}

	public String getTimeslotId() {
		return timeslotId;
	}

	public void setTimeslotId(String timeslotId) {
		this.timeslotId = timeslotId;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
