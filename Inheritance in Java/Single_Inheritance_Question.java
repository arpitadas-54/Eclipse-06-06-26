package com.inheritance;

class Teacher {
    String designation = "Teacher";
    String collegeName = "KIIT University";
}

class ComputerTeacher extends Teacher {
    String mainSubject = "Mathematics";

    void display() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Designation: " + designation);
        System.out.println("Main Subject: " + mainSubject);
    }
}

public class Single_Inheritance_Question {
    public static void main(String[] args) {
        ComputerTeacher ct = new ComputerTeacher();
        ct.display();
    }
}

