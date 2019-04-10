package com.epb.ah.bean;

public class EccustLoginPayload {

	private String orgId;
	private String name;
	private String pwd;
	private String ecshopId;
	private String guestRecKey;

	public EccustLoginPayload() {
		super();
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEcshopId() {
		return ecshopId;
	}

	public void setEcshopId(String ecshopId) {
		this.ecshopId = ecshopId;
	}

	public String getGuestRecKey() {
		return guestRecKey;
	}

	public void setGuestRecKey(String guestRecKey) {
		this.guestRecKey = guestRecKey;
	}

}
