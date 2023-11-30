package com.sparta.fk.singleton;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        SingletonExample singletonExample = SingletonExample.getSingleton();
        SingletonExample singletonExample1 = SingletonExample.getSingleton();

        System.out.println(singletonExample.hashCode());
        System.out.println(singletonExample1.hashCode());


    }

}
