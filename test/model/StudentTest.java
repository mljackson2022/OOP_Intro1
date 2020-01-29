package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void enrolledCourses() {
        Courses aCourse = new Courses(123,23,"Math","Learn how to Multiply",3);
        Student astudent = new Student(1,"John");
        astudent.enrolledCourses(aCourse);
    }

    @Test
    void setGrades(){
        Courses bCourse = new Courses(134,34,"English","Learn how to write",3);
        Student student1 = new Student(0, "Doe");
        student1.enrolledCourses(bCourse);
        student1.setGrade(bCourse,89.0);
        assertTrue(student1.setGrade(bCourse,89.0));

        Courses ccourse = new Courses(145,45,"Spanish","Learn a new language.",3);
        Student student2 = new Student(2,"Jam");
        student1.setGrade(ccourse,75.0);
        assertFalse(student1.setGrade(ccourse,75.0));
    }
    @Test
    void calculateGPA(){
        Courses courses1 = new Courses(146,24,"Science","Learn about cells.",3);
        Courses courses2 = new Courses(167,21,"CS 124","Learn about proofs.",3);
        Courses courses3 = new Courses(189,12,"Mat 136","Learn about probability.",3);

        Student student = new Student(3,"Florida");

        student.enrolledCourses(courses1);
        student.enrolledCourses(courses2);
        student.enrolledCourses(courses3);

        student.setGrade(courses1,100.0);
        student.setGrade(courses2,25.0);
        student.setGrade(courses3,80.0);

        assertEquals(1845,student.calculateGPA());
    }
}