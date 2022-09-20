package com.hackunamatata.mrbs.model;

import java.util.Date;

public class BookingInformation {
    private int bookingId;
    private String meetingRoomName;
    private Date date;
    private Date startTime;
    private Date endTime;
    private int bookedBy;

    public BookingInformation(int bookingId, String meetingRoomName, Date date, Date startTime, Date endTime, int bookedBy) {
        this.bookingId = bookingId;
        this.meetingRoomName = meetingRoomName;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookedBy = bookedBy;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(int bookedBy) {
        this.bookedBy = bookedBy;
    }
}
