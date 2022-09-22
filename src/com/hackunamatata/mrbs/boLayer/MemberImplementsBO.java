package com.hackunamatata.mrbs.boLayer;

import com.hackunamatata.mrbs.daoLayer.MemberImplementsDAO;
import com.hackunamatata.mrbs.model.Meeting;
import com.hackunamatata.mrbs.model.User;

public class MemberImplementsBO implements InterfaceBO{
    @Override
    public User getUserDetails(int id) {
        MemberImplementsDAO medo = new MemberImplementsDAO();
        return medo.getUserDetails(id);
    }

    @Override
    public double getUserCredits(User u) {
        MemberImplementsDAO medo = new MemberImplementsDAO();
        return medo.getUserCredits(u);
    }

    @Override
    public String updateUserCredits(User u, double crd) {
        MemberImplementsDAO medo = new MemberImplementsDAO();
        return medo.updateUserCredits(u,crd);
    }

    @Override
    public String addUserstoSystem(User u) {
        MemberImplementsDAO medo = new MemberImplementsDAO();
        return medo.addUserstoSystem(u);
    }
/*
    public Meeting memberSchedule() {
        MemberImplementsDAO medo = new MemberImplementsDAO();
        return medo.memberSchedule();
    }*/
}
