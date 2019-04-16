package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.EccartlineView;

public interface EccartlineViewRepository
		extends JpaRepository<EccartlineView, BigDecimal> {

	List<EccartlineView> findByCustIdAndEcshopId(final String custId, final String ecshopId);
}
