package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity

public class Securities {
    @Id
    @GeneratedValue()
    private long securitiesId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private long portfolio_ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public long getSecuritiesId() {
        return securitiesId;
    }

    public long getPortfolio_ID() {
        return portfolio_ID;
    }

    public void setPortfolio_ID(Portfolio portfolio) {
        this.portfolio_ID = portfolio.getPortfolioId();
    }
}
