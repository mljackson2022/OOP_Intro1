package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    int id;
    String name;
    HashMap<Integer,Double> grades;
    List<Courses> enrolledCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void displayCourse(){
        for (int i = 0; i < enrolledCourses.size(); i++){
            System.out.println(enrolledCourses.get(i));
        }

    }

    public double getGPA(){
        var total = 0;
        var totalCredits = 0;
        for (var course: enrolledCourses){
            if (grades.containsKey(course.getId())){
                total += grades.get(course.getId()) * course.getCredit();
                totalCredits += course.getCredit();
            }
        }
        return total/totalCredits;
    }

    public double calculateGPA() {
        double gpa = 0;
        int totalNumberCredits = 0;
        double counter = 0.0;

        for(Courses c : this.enrolledCourses){
            gpa = gpa + this.grades.get(c.getId())*c.getCredit();
            totalNumberCredits = totalNumberCredits + c.getCredit();
            counter = counter + 1.0;
        }
        gpa = gpa/counter;
        gpa = gpa * totalNumberCredits;
        return gpa;
    }


    public void enrolledCourses(Courses course){
        enrolledCourses.add(course);
    }

    public boolean setGrade(Courses course, double grade){
        if (enrolledCourses.contains(course)){
        grades.put(course.getId(),grade);
        return true;
        }
        return false;
    }

    public List<Courses> getEnrolledCourses() {
        return enrolledCourses;
    }

    public static void main(String[] args) {
        Courses acourse = new Courses(123,24,"Math","Learn about division.",3);
        Student student1 = new Student(0,"John");

        Courses bcourse = new Courses(134,25,"English","Learn how to write.",4);
        Student student2 = new Student(1,"Doe");

        Courses ccourse = new Courses(125,34,"CS 222","Learn how to program.",3);
        Student student3 = new Student(2,"Karen");

        student1.enrolledCourses(acourse);
        student2.enrolledCourses(bcourse);
        student3.enrolledCourses(ccourse);
        student1.displayCourse();
        student2.displayCourse();
        student3.displayCourse();
    }
}
