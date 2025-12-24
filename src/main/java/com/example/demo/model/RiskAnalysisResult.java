package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "risk_analysis_result")
public class RiskAnalysisResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long portfolioId;

    private String riskLevel;

    private Double riskScore;

    // --- Constructors ---
    public RiskAnalysisResult() {}

    public RiskAnalysisResult(Long portfolioId, String riskLevel, Double riskScore) {
        this.portfolioId = portfolioId;
        this.riskLevel = riskLevel;
        this.riskScore = riskScore;
    }

    // --- Getters & Setters ---
    public Long getId() {
        return id;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Double getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Double riskScore) {
        this.riskScore = riskScore;
    }
}