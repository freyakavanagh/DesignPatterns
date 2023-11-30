package com.sparta.fk.singleton;

public class SingletonExample {

    private static final SingletonExample example = new SingletonExample(); // must be static as called by static method

    private SingletonExample() { // private constructor
    }

    public static SingletonExample getSingleton(){ //so it can be called without object being made (none can be)
        return example;
    }
}
