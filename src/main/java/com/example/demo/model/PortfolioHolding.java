package com.example.demo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "portfolio_holdings")
public class PortfolioHolding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double quantity;

    private BigDecimal marketValue;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private UserPortfolio portfolio;

    public Long getId() {
        return id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public UserPortfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(UserPortfolio portfolio) {
        this.portfolio = portfolio;
    }
}