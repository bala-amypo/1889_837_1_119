package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.PortfolioHolding;

public interface PortfolioHoldingRepository extends JpaRepository<PortfolioHolding, Long> {}
