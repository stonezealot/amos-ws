package com.epb.ah.bean;

public class CartlineEditInstallationPayload {

	private String orgId;
	private String custId;
	private String ecshopId;
	private String stkId;
	private String installation;

	public CartlineEditInstallationPayload() {
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

	public String getStkId() {
		return stkId;
	}

	public void setStkId(String stkId) {
		this.stkId = stkId;
	}

	public String getInstallation() {
		return installation;
	}

	public void setInstallation(String installation) {
		this.installation = installation;
	}

}
