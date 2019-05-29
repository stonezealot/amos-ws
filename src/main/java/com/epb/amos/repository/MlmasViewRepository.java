package com.epb.amos.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.amos.entity.MlmasView;

public interface MlmasViewRepository
		extends JpaRepository<MlmasView, BigDecimal> {

}
