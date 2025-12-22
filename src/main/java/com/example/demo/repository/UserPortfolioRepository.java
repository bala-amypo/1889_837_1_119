package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.UserPortfolio;

public interface UserPortfolioRepository extends JpaRepository<UserPortfolio, Long> {}
