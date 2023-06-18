package controller;

import model.Classs;
import service.ClassService;

import java.util.ArrayList;

public class ClassController {
    private ClassService classService;

    {
        try {
            classService = new ClassService();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Classs> getAll() {
        return classService.getAll();
    }

    public int getSize() {
        return classService.getSize();
    }

    public void save(Classs myClass) {
        classService.save(myClass);
    }

    public void deleteClass(int id) {
        classService.deleteClass(id);
    }

    public Classs findById(int id) {
        return classService.findById(id);
    }

    public int getNewId() {
        return classService.getNewId();
    }
}
