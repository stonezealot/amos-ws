package com.epb.ah.service;

public class ProcedureResponseWithOrderDocId
		extends ProcedureResponse {

	private String orderDocId;
	private String orderRecKey;

	public ProcedureResponseWithOrderDocId(
			String errCode, String errMsg, String orderDocId, String orderRecKey) {
		super(errCode, errMsg);
		this.orderDocId = orderDocId;
		this.orderRecKey = orderRecKey;
	}

	public ProcedureResponseWithOrderDocId(String errCode, String errMsg) {
		super(errCode, errMsg);
	}

	public ProcedureResponseWithOrderDocId() {
		super();
	}

	public String getOrderDocId() {
		return orderDocId;
	}

	public void setOrderDocId(String orderDocId) {
		this.orderDocId = orderDocId;
	}

	public String getOrderRecKey() {
		return orderRecKey;
	}

	public void setOrderRecKey(String orderRecKey) {
		this.orderRecKey = orderRecKey;
	}

}
