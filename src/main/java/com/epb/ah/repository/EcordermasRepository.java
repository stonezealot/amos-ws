package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Ecordermas;

public interface EcordermasRepository
		extends JpaRepository<Ecordermas, BigDecimal> {

	List<Ecordermas> findByVipIdAndEcshopIdOrderByRecKeyDesc(final String vipId, final String ecshopId);
}
