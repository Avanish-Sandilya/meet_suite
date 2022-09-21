package com.hackunamatata.mrbs.daoLayer;

import com.hackunamatata.mrbs.model.BookingInformation;
import com.hackunamatata.mrbs.model.Meeting;
import com.hackunamatata.mrbs.model.MeetingRoom;
import com.hackunamatata.mrbs.model.User;

import java.util.List;

public interface InterfaceDAO {
    public User getUserDetails(int id);
    public double getUserCredits(User u);
    public String updateUserCredits(User u, double crd);
    public String addUserstoSystem(User u);

}
