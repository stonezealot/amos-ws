package com.epb.ah.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.EcDeliveryTimeslot;

public interface EcDeliveryTimeslotRepository
		extends JpaRepository<EcDeliveryTimeslot, BigDecimal> {

}
