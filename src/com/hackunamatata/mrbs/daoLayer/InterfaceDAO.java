package com.hackunamatata.mrbs.daoLayer;

import com.hackunamatata.mrbs.model.User;

public interface InterfaceDAO {
    public User getUserDetails(int id);
    public double getUserCredits(User u);
    public String updateUserCredits(User u, double crd);
    public String addUserstoSystem(User u);
}
