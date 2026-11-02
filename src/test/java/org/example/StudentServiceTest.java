package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import java.util.List;

public class StudentServiceTest {

    @Test
    public void testGetStudentWithStudents(){
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Lethabo");

        List<Student> listOfStudent = studentService.getStudents();
        studentService.addStudents(student);

        boolean actualResults = listOfStudent.isEmpty();

        assertFalse(actualResults);

    }

    @Test
    public void testGetStudentWithNoStudents(){
        StudentService studentService = new StudentService();

        List<Student> listOfStudent = studentService.getStudents();

        boolean actualResults = listOfStudent.isEmpty();

        assertTrue(actualResults);

    }
}
