package com.hackunamatata.mrbs.daoLayer;

import com.hackunamatata.mrbs.model.MeetingRoom;
import com.hackunamatata.mrbs.model.User;

import java.sql.*;
import java.util.List;

public class AdminImplementsDAO implements InterfaceDAO{
    @Override
    public User getUserDetails(int id) throws SQLException {
        String url = "__MYSql";
        Connection con = DriverManager.getConnection(url);
        PreparedStatement pstmt = con.prepareStatement("select *from ? where id = ?");
        pstmt.setInt(1,##);
        pstmt.setString(2, String.valueOf(id));
        ResultSet set = pstmt.executeQuery();
        con.close();
        User u = new User(set.getInt(1),set.getString(2),set.getString(3),set.getLong(4),set.getDouble(5),set.getString(4));
        return u;
    }

    @Override
    public double getUserCredits(User u) {
        return 0;
    }

    @Override
    public String updateUserCredits(User u, double crd) {
        return null;
    }

    @Override
    public String addUserstoSystem(User u) {
        return null;
    }


    public List<MeetingRoom> getMeetingRooms() {
        return null;
    }


    public String addMeetingRoom(MeetingRoom m) {
        return null;
    }

    public String editMeetingRoom(MeetingRoom m) {
        return null;
    }

    public String deleteMeetingRoom(MeetingRoom m) {
        return null;
    }

    public String CreditAmenities(MeetingRoom m) {
        return null;
    }
}
