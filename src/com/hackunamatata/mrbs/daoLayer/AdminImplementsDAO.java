package com.hackunamatata.mrbs.daoLayer;

import com.hackunamatata.mrbs.model.User;

public class AdminImplementsDAO implements InterfaceDAO{
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
}
