package com.springbootproject.springbootyoutube.job;

public class Job {

    private Long id;
    private String role;
    private String  company;
    private String minsalary;
    private String maxSalary;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getMinsalary() {
        return minsalary;
    }
    public void setMinsalary(String minsalary) {
        this.minsalary = minsalary;
    }
    public String getMaxSalary() {
        return maxSalary;
    }
    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }
    public Job(Long id, String role, String company, String minsalary, String maxSalary) {
        this.id = id;
        this.role = role;
        this.company = company;
        this.minsalary = minsalary;
        this.maxSalary = maxSalary;
    }
    

}
