package com.hackunamatata.mrbs.model;

public class MeetingRoom {
    private String name;
    private int seatCapacity;
    private double ratings;
    private String amenities;
    private int count;

    public MeetingRoom(String name, int seatCapacity, double ratings, String amenities, int count) {
        this.name = name;
        this.seatCapacity = seatCapacity;
        this.ratings = ratings;
        this.amenities = amenities;
        this.count = count;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public double getRatings() {
        return ratings;
    }
    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getAmenities() {
        return amenities;
    }
    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
