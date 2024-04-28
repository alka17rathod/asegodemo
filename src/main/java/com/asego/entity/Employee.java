package com.asego.entity;

import com.asego.common.AuditableBean;
import jakarta.persistence.*;
@Entity
public class Employee extends AuditableBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private Integer employeeCode;
    private String  name;
    private String pnoneNo;
    private String mailId;
    private String designation;
    private String Password;
    private String userName;


    public String getPassword() {
        return Password;
    }

    public Employee(Integer empId, Integer employeeCode, String name, String pnoneNo, String mailId, String designation, String password, SellingPlan sellingPlan, Branch branch) {
        this.empId = empId;
        this.employeeCode = employeeCode;
        this.name = name;
        this.pnoneNo = pnoneNo;
        this.mailId = mailId;
        this.designation = designation;
        Password = password;
        this.sellingPlan = sellingPlan;
        this.branch = branch;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @OneToOne
    @JoinColumn(name="PlanId")
    private SellingPlan sellingPlan;
    @OneToOne
    @JoinColumn(name="branchId")
    private Branch branch;

    public Integer getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Integer employeeCode) {
        employeeCode = employeeCode;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMailId() {
        return mailId;
    }


    public Employee() {
    }



    public void setEmployeeCode(int employeeCode) {
        employeeCode = employeeCode;
    }

    public String getPnoneNo() {
        return pnoneNo;
    }

    public void setPnoneNo(String pnoneNo) {
        this.pnoneNo = pnoneNo;
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

    public SellingPlan getSellingPlan() {
        return sellingPlan;
    }

    public void setSellingPlan(SellingPlan sellingPlan) {
        this.sellingPlan = sellingPlan;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
