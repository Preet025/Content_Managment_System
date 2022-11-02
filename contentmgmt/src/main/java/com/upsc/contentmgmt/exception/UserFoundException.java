package com.upsc.contentmgmt.exception;

public class UserFoundException extends Exception{


    public UserFoundException(String s) {
        super("User with this Username is already there in DB !! try with another one");
    }
}
