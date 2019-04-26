package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.EcbookmarkView;

public interface EcbookmarkRepository
		extends JpaRepository<EcbookmarkView, BigDecimal> {

	List<EcbookmarkView> findByCustIdAndEcshopId(final String custId, final String ecshopId);
}
