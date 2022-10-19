package com.challenge;

public class User {
    int id;
    private String firstname;
    private String lastname;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id).append(":").append(firstname).append(":").append(lastname);
        // builder.append("[").append("id=").append(id).append(",
        // ").append(Name).append(", gender=")
        // .append(Gender).append(", role=").append(role).append("]");
        return builder.toString();
    }
}