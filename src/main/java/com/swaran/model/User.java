package com.swaran.model;

/**
 * Created by Home on 16/01/2015.
 */
public class User {

    private String first;
    private String last;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public User(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
