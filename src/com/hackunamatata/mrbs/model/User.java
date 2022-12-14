package com.hackunamatata.mrbs.model;

public class User {
    private int userId;
    private String name;
    private String email;
    private long phone;
    private double credits;
    private String role;

    public User(int userId, String name, String email, long phone, double credits, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.credits = credits;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double getCredits() {
        return credits;
    }
    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
