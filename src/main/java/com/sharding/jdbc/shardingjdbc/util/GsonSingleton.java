package com.sharding.jdbc.shardingjdbc.util;

import com.google.gson.Gson;

public class GsonSingleton {

    private static Gson instance;

    private GsonSingleton() {
    }

    public static synchronized Gson getInstance() {
        if (instance == null) {
            instance = new Gson();
        }
        return instance;
    }
}
