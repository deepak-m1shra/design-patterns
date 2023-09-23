package com.lld.singleton;

public class SingletonDriver {
    public static void main(String[] args) {
        // The following work as the constructor is private
        // DBEagerSingleton eagerSingleton = new DBEagerSingleton();

        DBEagerSingleton eagerSingleton1 = DBEagerSingleton.getInstance();
        DBEagerSingleton eagerSingleton2 = DBEagerSingleton.getInstance();

        // Check if both instances are same or different (IntelliJ can tell this at compile time :)
        if(eagerSingleton1.equals(eagerSingleton2)) {
            System.out.println("EagerSingleton:: Both are same");
        }

        DBLazySingleton lazySingleton1 = DBLazySingleton.getInstance();
        DBLazySingleton lazySingleton2 = DBLazySingleton.getInstance();

        if(lazySingleton1 == lazySingleton2) {
            System.out.println("LazySingleton :: Both references the same and equal");
        }
    }
}
