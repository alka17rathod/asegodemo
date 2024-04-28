package com.asego.dto;

public class SellingPlanDto {
    private Integer planId;
    private  String masterPolicyNumber;
    private int days;
    private int premium;
    private String planName;
    private int sumInsured;
    private String country;

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
}
