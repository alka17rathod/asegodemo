package com.asego.dto;

import com.asego.entity.Branch;
import com.asego.entity.SellingPlan;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class EmployeeDto {
    private String  name;
    private String userName;
    private String mailId;
    private String designation;
    private int planId;
    private int branchId;
    private Integer EmployeeCode;
    private String phoneNo;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(Integer employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
