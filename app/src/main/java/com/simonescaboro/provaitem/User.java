package com.simonescaboro.provaitem;

import java.util.Set;

/**
 * Created by simonescaboro on 08/05/17.
 */

public class User {
    private String userName;
    private String userSurname;
    private Set<String> userLocation;
    private String userPrivateDesctiption;

    public String getUserPrivateDesctiption() {
        return userPrivateDesctiption;
    }

    public void setUserPrivateDesctiption(String userPrivateDesctiption) {
        this.userPrivateDesctiption = userPrivateDesctiption;
    }

    public Set<String> getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Set<String> userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
