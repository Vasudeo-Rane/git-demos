package org.example;

public class Student1 {
    private String firstName;
    private String LastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Student1(String firstName, String lastName) {
        this.firstName = firstName;
        this.LastName = lastName;
    }
}
