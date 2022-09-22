package com.hackunamatata.mrbs.boLayer;

import com.hackunamatata.mrbs.daoLayer.ManagerImplementsDAO;
import com.hackunamatata.mrbs.model.BookingInformation;
import com.hackunamatata.mrbs.model.Meeting;
import com.hackunamatata.mrbs.model.MeetingRoom;
import com.hackunamatata.mrbs.model.User;

import java.sql.SQLException;

public class ManagerImplementsBO implements InterfaceBO{
    @Override
    public User getUserDetails(int id) {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.getUserDetails(id);

    }

    @Override
    public double getUserCredits(User u) {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.getUserCredits(u);
    }

    @Override
    public String updateUserCredits(User u, double crd) {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.updateUserCredits(u,crd);
    }

    @Override
    public String addUserstoSystem(User u) throws SQLException {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.addUserstoSystem(u);
    }


    public String createMeeting(Meeting m) throws SQLException {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.createMeeting(m);

    }


    public String editMeeting(Meeting m) {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.editMeeting(m);
    }


    public String deleteMeeting(Meeting m) {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.deleteMeeting(m);
    }


    public BookingInformation AvailableRoom() {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.AvailableRoom();
    }


    public String resetManagerCredits() {
        ManagerImplementsDAO mdo = new ManagerImplementsDAO();
        return mdo.resetManagerCredits();

    }


}
