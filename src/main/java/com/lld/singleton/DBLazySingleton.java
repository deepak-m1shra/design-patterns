package com.lld.singleton;

import javax.xml.crypto.Data;

public class DBLazySingleton {

    private static DBLazySingleton INSTANCE = null;

    private DBLazySingleton() {}

    public static DBLazySingleton getInstance() {
        if(INSTANCE == null) {
            // Lazy initialization (when required)
            INSTANCE = new DBLazySingleton();
        }
        return INSTANCE;
    }
}
