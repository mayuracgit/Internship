package com.mac.sql.common;

public class Player {

    private int id;
    private String name;
    private String responsibility;

    public Player() {

    }

    public Player(int id, String name, String responsibility) {
        this.id = id;
        this.name = name;
        this.responsibility = responsibility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
}
