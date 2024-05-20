package org.example;

import java.util.Objects;

public final class Student {
    private String id;

    private String name;
    private String phoneNumber;
    private String emailId ;

    public Student(String id, String name, String phoneNumber, String emailId) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    @Override
   public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(phoneNumber, student.phoneNumber) && Objects.equals(emailId, student.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phoneNumber, emailId);
    }
}
