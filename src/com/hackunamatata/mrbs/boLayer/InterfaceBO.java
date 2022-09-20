package com.hackunamatata.mrbs.boLayer;

import com.hackunamatata.mrbs.model.User;

public interface InterfaceBO {
    public User getUserDetails(int id);
    public double getUserCredits(User u);
    public String updateUserCredits(User u, double crd);
    public String addUserstoSystem(User u);
}
