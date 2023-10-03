package com.aleksei.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before(value = "execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: logging of " +
                "student list before getStudents");
    }
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstSt = students.get(0);
        String name = firstSt.getNameSurname();
        name = "Mr. " + name;
        firstSt.setNameSurname(name);

        double avgGrade = firstSt.getAvgGrade();
        avgGrade++;
        firstSt.setAvgGrade(avgGrade);
        System.out.println("afterReturningGetStudentsLoggingAdvice: logging of " +
                "student list after getStudents");
    }

}
