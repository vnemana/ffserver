package com.mahesh.ffserver.db;

import javax.persistence.*;

@Entity
public class Fund {
    @Column(name="fundId", nullable = false)
    private int fundId;
    @Column(name="fundName")
    private String fundName;
    @Column(name="cik")
    private String cik;

    public void setFundId(int fundId) {
        this.fundId = fundId;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getFundId() {
        return fundId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }
}
