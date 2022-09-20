package com.hackunamatata.mrbs.model;

import java.util.Date;

public class Meeting {
    private int meetingId;
    private String title;
    private int orgBy;
    private Date meetingDate;
    private Date startTime;
    private Date endTime;
    private String membersList;
    private String meetingRoomInfo;
//    private enum meetingType{
//
//    }

    public Meeting(int meetingId, String title, int orgBy, Date meetingDate, Date startTime, Date endTime, String membersList, String meetingRoomInfo) {
        this.meetingId = meetingId;
        this.title = title;
        this.orgBy = orgBy;
        this.meetingDate = meetingDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.membersList = membersList;
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

    public String getMembersList() {
        return membersList;
    }
    public void setMembersList(String membersList) {
        this.membersList = membersList;
    }

    public String getMeetingRoomInfo() {
        return meetingRoomInfo;
    }
    public void setMeetingRoomInfo(String meetingRoomInfo) {
        this.meetingRoomInfo = meetingRoomInfo;
    }
}
