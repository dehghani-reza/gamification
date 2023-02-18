package com.gamification.core;

public class RestAddress {
    private RestAddress() {
    }
    public static final String SAVE = "/save";
    public static final String UPDATE = "/update";
    public static final String DELETE = "/delete";
    public static final String FIND_BY_ID = "/find-by-id/{id}";
    public static final String FIND_ALL = "/find-all";
    //--------- person end point 👇 ---------
    public static final String PERSON = "/person";
}
