package com.epb.amos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MlmasSuppDistinct {

	@Id
	private String suppName;
	private String suppId;
	private String custId;

	public MlmasSuppDistinct() {
		super();
	}

	public String getSuppId() {
		return suppId;
	}

	public void setSuppId(String suppId) {
		this.suppId = suppId;
	}

	public String getSuppName() {
		return suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

}
