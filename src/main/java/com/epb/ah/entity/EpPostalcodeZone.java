package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EpPostalcodeZone {

	@Id
	private BigDecimal recKey;
	private String fromPostalcode;
	private String toPostalcode;
	private String zoneId;

	public EpPostalcodeZone() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getFromPostalcode() {
		return fromPostalcode;
	}

	public void setFromPostalcode(String fromPostalcode) {
		this.fromPostalcode = fromPostalcode;
	}

	public String getToPostalcode() {
		return toPostalcode;
	}

	public void setToPostalcode(String toPostalcode) {
		this.toPostalcode = toPostalcode;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

}
