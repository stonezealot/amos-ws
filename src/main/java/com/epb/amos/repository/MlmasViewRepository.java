package com.epb.amos.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.amos.entity.MlmasView;

public interface MlmasViewRepository
		extends JpaRepository<MlmasView, BigDecimal> {

}
