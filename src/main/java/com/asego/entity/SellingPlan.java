package com.asego.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SellingPlan {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planId;
    private  String masterPolicyNumber;
    private int days;
    private int premium;
    private String planName;
    private int sumInsured;
    private String country;
    private Integer providerId;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getMasterPolicyNumber() {
        return masterPolicyNumber;
    }

    public void setMasterPolicyNumber(String masterPolicyNumber) {
        this.masterPolicyNumber = masterPolicyNumber;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(int sumInsured) {
        this.sumInsured = sumInsured;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }
}
