package com.springbootproject.springbootyoutube.job;

public class Job {

    private Long id;
    private String role;
    private String  company;
    private String minsalary;
    private String maxSalary;
    private String location;

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

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
    public Job(Long id, String role, String company, String minsalary, String maxSalary, String location) {
        this.id = id;
        this.role = role;
        this.company = company;
        this.minsalary = minsalary;
        this.maxSalary = maxSalary;
        this.location=location; 
    }
    

}
