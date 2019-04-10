package com.epb.ah.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Opentable;

public interface OpentableRepository
		extends JpaRepository<Opentable, BigDecimal> {

}
