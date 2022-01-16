package com.mahesh.ffserver.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Holding {
    private int holdingId;
    private int fundId;
    private int filingId;
    private String cusip;
    private String stock;
    private double position;
    private int numshares;

    public void setHoldingId(int holdingId) {
        this.holdingId = holdingId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getHoldingId() {
        return holdingId;
    }

    public int getFundId() {
        return fundId;
    }

    public void setFundId(int fundId) {
        this.fundId = fundId;
    }

    public int getFilingId() {
        return filingId;
    }

    public void setFilingId(int filingId) {
        this.filingId = filingId;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public int getNumshares() {
        return numshares;
    }

    public void setNumshares(int numshares) {
        this.numshares = numshares;
    }
}
