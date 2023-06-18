package controller;

import model.Students;
import service.StudentService;

import java.util.ArrayList;

public class StudentController {
    private StudentService studentService = new StudentService();

    public ArrayList<Students> getAll() {
        return studentService.getAll();
    }

    public int getSize() {
        return studentService.getSize();
    }

    public void save(Students student) {
        studentService.save(student);
    }

    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
    }

    public Students findById(int id) {
        return studentService.findById(id);
    }

    public int getNewId() {
        return studentService.getNewId();
    }
}
