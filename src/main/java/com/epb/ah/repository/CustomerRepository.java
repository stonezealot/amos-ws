package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Customer;

public interface CustomerRepository
		extends JpaRepository<Customer, BigDecimal> {

	List<Customer> findByCustIdAndOrgId(String custId,String orgId);
}
