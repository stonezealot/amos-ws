package com.epb.ah.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.ECSTK;

public interface EcStockRepository
		extends JpaRepository<ECSTK, BigDecimal> {

}
