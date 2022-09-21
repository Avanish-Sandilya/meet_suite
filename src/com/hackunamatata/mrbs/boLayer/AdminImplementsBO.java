package com.hackunamatata.mrbs.boLayer;

import com.hackunamatata.mrbs.model.MeetingRoom;
import com.hackunamatata.mrbs.model.User;

import java.util.ArrayList;
import java.util.List;

public class AdminImplementsBO implements InterfaceBO{
    @Override
    public User getUserDetails(int id) {
        return null;
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
