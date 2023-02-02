package com.mac.json;

public class College {

    private Students student;

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "College{" +
                "student=" + student +
                '}';
    }
}
