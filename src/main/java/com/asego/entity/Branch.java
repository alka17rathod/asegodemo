package com.asego.entity;

import com.asego.common.AuditableBean;
import jakarta.persistence.*;

@Entity
public class Branch extends AuditableBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer branchId;
    private String name;
    private String region;
    private String address;

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Branch(Integer branchId, String name, String region, String address) {
        this.branchId = branchId;
        this.name = name;
        this.region = region;
        this.address = address;
    }

    public Branch() {
    }
}
