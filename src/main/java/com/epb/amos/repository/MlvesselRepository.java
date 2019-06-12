package com.epb.amos.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.amos.entity.Mlvessel;

public interface MlvesselRepository
		extends JpaRepository<Mlvessel, BigDecimal> {

}
