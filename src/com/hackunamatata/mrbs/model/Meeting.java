package com.hackunamatata.mrbs.model;

import java.util.Date;
import java.util.List;

public class Meeting {
    private int meetingId;
    private String title;
    private int orgBy;
    private Date meetingDate;
    private Date startTime;
    private Date endTime;
    private List<User> usersList;
    private List<Meeting> meetingRoomInfo;
//    private enum meetingType{
//
//    }


    public Meeting(int meetingId, String title, int orgBy, Date meetingDate, Date startTime, Date endTime, List<User> usersList, List<Meeting> meetingRoomInfo) {
        this.meetingId = meetingId;
        this.title = title;
        this.orgBy = orgBy;
        this.meetingDate = meetingDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.usersList = usersList;
        this.meetingRoomInfo = meetingRoomInfo;
    }

    public int getMeetingId() {
        return meetingId;
    }
    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getOrgBy() {
        return orgBy;
    }
    public void setOrgBy(int orgBy) {
        this.orgBy = orgBy;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }
    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
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

    public List<User> getUsersList() {
        return usersList;
    }
    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public List<Meeting> getMeetingRoomInfo() {
        return meetingRoomInfo;
    }
    public void setMeetingRoomInfo(List<Meeting> meetingRoomInfo) {
        this.meetingRoomInfo = meetingRoomInfo;
    }
}
