package com.epb.amos.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EpVersion {

	@Id
	private BigDecimal epVerNum;

	public EpVersion() {
		super();
	}

	public BigDecimal getEpVerNum() {
		return epVerNum;
	}

	public void setEpVerNum(BigDecimal epVerNum) {
		this.epVerNum = epVerNum;
	}
}
