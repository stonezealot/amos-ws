package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Eccart;

public interface EccartRepository
		extends JpaRepository<Eccart, BigDecimal> {

	List<Eccart> findByCustIdAndEcshopId(final String custId, final String ecshopId);
}
