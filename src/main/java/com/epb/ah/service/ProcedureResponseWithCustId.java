package com.epb.ah.service;


import com.epb.ah.service.ProcedureResponse;

public class ProcedureResponseWithCustId 
        extends ProcedureResponse{

	private String custId;
	private String custName;
	private String classId;
	
	public ProcedureResponseWithCustId(
			String errCode, String errMsg, String custId,String custName,String classId) {
		super(errCode, errMsg);
		this.custId = custId;
		this.custName = custName;
		this.classId = classId;
	}
	
	public ProcedureResponseWithCustId(String errCode, String errMsg){
		super(errCode, errMsg);
	}

	public ProcedureResponseWithCustId() {
		super();
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}
}
