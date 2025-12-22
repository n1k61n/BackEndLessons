package org.example;

public enum UserRoles {
    ADMIN,
    USER,
    GUEST;


    public boolean isAdmin(){
        return this == ADMIN;
    }
}
