package com.hackunamatata.mrbs.daoLayer;

import com.hackunamatata.mrbs.model.BookingInformation;
import com.hackunamatata.mrbs.model.Meeting;
import com.hackunamatata.mrbs.model.MeetingRoom;
import com.hackunamatata.mrbs.model.User;

import java.sql.*;
import java.util.ArrayList;

public class ManagerImplementsDAO implements InterfaceDAO{
    static ArrayList<User> meetingUserList = new ArrayList<>();
    static ArrayList<Meeting> meetingRoomInfo =  new ArrayList<>();
    @Override
    public User getUserDetails(int id) {
        return null;
        //JAGRIT
    }

    @Override
    public double getUserCredits(User u) {
        return 0;
        //JAGRIT
    }

    @Override
    public String updateUserCredits(User u, double crd) {
        return null;
        //JAGRIT
    }

    @Override
    public String addUserstoSystem(User u) throws SQLException {
        String url = "__MYSql";
        try{
            Connection con = DriverManager.getConnection(url);
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM User WHERE userId=?");
            pstmt.setInt(1, u.getUserId());
            ResultSet rs = pstmt.executeQuery();
            if(!rs.next()){
                PreparedStatement pstmt2 = con.prepareStatement("INSERT INTO User VALUES(?,?,?,?,?,?)");
                pstmt2.setInt(1, u.getUserId());
                pstmt2.setString(2, u.getName());
                pstmt2.setString(3, u.getEmail());
                pstmt2.setLong(4, u.getPhone());
                pstmt2.setDouble(5, u.getCredits());
                pstmt2.setString(6, u.getRole());
                pstmt2.executeUpdate();
                con.close();
                return "User created successfully";
            }else{
                return "A user already exits with this user id";
            }
        }catch(SQLException e){
            throw e;
            //create new exception - meeting already exists
        }
    }

    public String createMeeting(Meeting m) throws SQLException {
        String url = "__MYSql";
        try{
            Connection con = DriverManager.getConnection(url);
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Meeting WHERE meetingId=?");
            pstmt.setInt(1, m.getMeetingId());
            ResultSet rs = pstmt.executeQuery();
            if(!rs.next()){
                PreparedStatement pstmt2 = con.prepareStatement("INSERT INTO Meeting VALUES(?,?,?,?,?,?)");
                pstmt2.setInt(1, m.getMeetingId());
                pstmt2.setString(2, m.getTitle());
                pstmt2.setInt(3, m.getOrgBy());
                pstmt2.setDate(4, (Date) m.getMeetingDate());
                pstmt2.setDate(5, (Date) m.getStartTime());
                pstmt2.setDate(6, (Date) m.getEndTime());
                pstmt2.executeUpdate();
                con.close();
                return "Meeting created successfully";
            }else{
                return "A meeting already exits with this id";
            }
        }catch(SQLException e){
            throw e;
            //create new exception - meeting already exists
        }
    }

    public String editMeeting(Meeting m) {
        return null;
        //DIVYANSHU
    }

    public String deleteMeeting(Meeting m) {
        return null;
        //DIVYANSHU
    }

    public BookingInformation AvailableRoom() {
        return null;
        //DIVYANSHU
    }

    public String resetManagerCredits() {
        return null;
        //DIVYANSHU
    }
}
