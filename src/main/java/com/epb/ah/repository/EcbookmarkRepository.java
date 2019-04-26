package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Ecbookmark;

public interface EcbookmarkRepository
		extends JpaRepository<Ecbookmark, BigDecimal> {

	List<Ecbookmark> findByCustIdAndEcshopId(final String custId, final String ecshopId);
}
