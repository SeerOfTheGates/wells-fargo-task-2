package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity

public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    @Column(nullable = false)
    private long Client_ID;

    protected Portfolio(){}

    public Portfolio(Client client_Id){
        this.Client_ID = client_Id.getClientId();
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getClient_ID() {
        return Client_ID;
    }

    public void setClient_ID(Client client_ID) {
        this.Client_ID = client_ID.getClientId();
    }
}