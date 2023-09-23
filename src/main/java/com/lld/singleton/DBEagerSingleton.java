package com.lld.singleton;

public class DBEagerSingleton {

    // Eager initialization of the instance variable
    private static final DBEagerSingleton INSTANCE = new DBEagerSingleton();

    private DBEagerSingleton(){}

    public static DBEagerSingleton getInstance() {
        return INSTANCE;
    }
}
