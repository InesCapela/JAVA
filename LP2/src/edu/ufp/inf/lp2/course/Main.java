package edu.ufp.inf.lp2.course;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date=new Date();
        CourseClass courseClass= new CourseClass("LP2");
        System.out.println(courseClass);
        Student s1= new Student(1,date,courseClass);

    }
}
