package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Ecstk;

public interface EcstkRepository
		extends JpaRepository<Ecstk, BigDecimal> {

}
