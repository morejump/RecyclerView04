package com.example.hp.recyclerview04;

/**
 * Created by HP on 9/10/2016.
 */
public class Person {
    private String name;
    private String SDT;

    public Person(String name, String SDT) {
        this.name = name;
        this.SDT = SDT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
