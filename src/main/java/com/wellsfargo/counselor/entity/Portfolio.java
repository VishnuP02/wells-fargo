package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @Column(nullable = false)
    private LocalDate creationDate;

    @Column(nullable = false)
    private double totalValue;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    // Constructor, Getters, Setters

    public Portfolio(Client client, double totalValue, LocalDate creationDate) {
        this.client = client;
        this.totalValue = totalValue;
        this.creationDate = creationDate;
    }

    // Only a getter for portfolioId
    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}