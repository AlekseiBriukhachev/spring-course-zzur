package com.aleksei.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();
    public void addStudents() {
        Student st1 = new Student("Aleks", 4, 7.5);
        Student st2 = new Student("Zaur", 2, 8.3);
        Student st3 = new Student("Michal", 1, 9.1);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudents() {
        System.out.println("Information from getStudents");
        System.out.println(students);
        return students;
    }
}
