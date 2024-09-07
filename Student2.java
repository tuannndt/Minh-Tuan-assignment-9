package javaapplication;

import java.util.Scanner;

public class Student2 {

    int ID;
    String name;

    public Student2(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    void displayInformation() {
        System.out.println("ID: " + ID + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student2 student1 = new Student2(1, "Nam");
        Student2 student2 = new Student2(2, "Lan");
        student1.displayInformation();
        student2.displayInformation();
    }

}
