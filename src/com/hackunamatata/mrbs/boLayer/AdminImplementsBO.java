package com.hackunamatata.mrbs.boLayer;

import com.hackunamatata.mrbs.daoLayer.AdminImplementsDAO;
import com.hackunamatata.mrbs.model.MeetingRoom;
import com.hackunamatata.mrbs.model.User;

import java.util.ArrayList;
import java.util.List;

public class AdminImplementsBO implements InterfaceBO{
    @Override
    public User getUserDetails(int id) {
        AdminImplementsDAO ado = new AdminImplementsDAO();
        return ado.getUserDetails(id);
    }

    @Override
    public double getUserCredits(User u) {
        AdminImplementsDAO ado = new AdminImplementsDAO();
        return ado.getUserCredits(u);
    }

    @Override
    public String updateUserCredits(User u, double crd) {
        AdminImplementsDAO ado = new AdminImplementsDAO();
        return ado.updateUserCredits(u,crd);
    }

    @Override
    public String addUserstoSystem(User u) {
        AdminImplementsDAO ado = new AdminImplementsDAO();
        return ado.addUserstoSystem(u);
    }

    public List<MeetingRoom> getMeetingRooms() {
        AdminImplementsDAO ado = new AdminImplementsDAO();

        return ado.getMeetingRooms();
    }

    public String addMeetingRoom(MeetingRoom m) {
        AdminImplementsDAO ado = new AdminImplementsDAO();
        return ado.addMeetingRoom(m);
    }

    public String editMeetingRoom(MeetingRoom m) {
        AdminImplementsDAO ado = new AdminImplementsDAO();
        return ado.editMeetingRoom(m);
    }


    public String deleteMeetingRoom(MeetingRoom m) {
        AdminImplementsDAO ado = new AdminImplementsDAO();
        return ado.deleteMeetingRoom(m);
    }


    public String CreditAmenities(MeetingRoom m) {
        AdminImplementsDAO ado = new AdminImplementsDAO();
        return ado.CreditAmenities(m);
    }


}
