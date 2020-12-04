package com.example.springbootkafkajson;

public class User {
	private String firstname;
    private String email;


    public User() {}
    public User(String firstname, String email) {
        super();
        this.firstname = firstname;
        this.email = email;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "User{"
                + "firstName = '" + firstname + "'"
                + ", email = '" + email + "'"
                + "}";
    }
    
}
