package com.lld.singleton;

public class DBDoubleCheckLockingSingleton {

    private static DBDoubleCheckLockingSingleton INSTANCE = null;

    private DBDoubleCheckLockingSingleton(){}

    public DBDoubleCheckLockingSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (DBDoubleCheckLockingSingleton.class){
                if(INSTANCE == null) {
                    INSTANCE = new DBDoubleCheckLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
