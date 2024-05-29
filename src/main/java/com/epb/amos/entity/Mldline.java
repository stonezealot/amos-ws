package com.epb.amos.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mldline {

	@Id
	private BigDecimal recKey;
	private BigDecimal masRecKey;
	private BigDecimal srcRecKey;

	public Mldline() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public BigDecimal getMasRecKey() {
		return masRecKey;
	}

	public void setMasRecKey(BigDecimal masRecKey) {
		this.masRecKey = masRecKey;
	}

	public BigDecimal getSrcRecKey() {
		return srcRecKey;
	}

	public void setSrcRecKey(BigDecimal srcRecKey) {
		this.srcRecKey = srcRecKey;
	}

}
