package com.epb.ah.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EcDeliveryTimeslot {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String dlyZoneId;
	private String timeslotId;
	private String timeframe;
	private BigDecimal maxLoad;
	private Date dlyDate;
	private String dlyDesc;

	public EcDeliveryTimeslot() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getDlyZoneId() {
		return dlyZoneId;
	}

	public void setDlyZoneId(String dlyZoneId) {
		this.dlyZoneId = dlyZoneId;
	}

	public String getTimeslotId() {
		return timeslotId;
	}

	public void setTimeslotId(String timeslotId) {
		this.timeslotId = timeslotId;
	}

	public String getTimeframe() {
		return timeframe;
	}

	public void setTimeframe(String timeframe) {
		this.timeframe = timeframe;
	}

	public BigDecimal getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(BigDecimal maxLoad) {
		this.maxLoad = maxLoad;
	}

	public Date getDlyDate() {
		return dlyDate;
	}

	public void setDlyDate(Date dlyDate) {
		this.dlyDate = dlyDate;
	}

	public String getDlyDesc() {
		return dlyDesc;
	}

	public void setDlyDesc(String dlyDesc) {
		this.dlyDesc = dlyDesc;
	}

}
