package com.training.util;

public class CustomException extends Exception {
    @Override
    public String getMessage(){
        return "SQL error occured during the query";
    }
}
