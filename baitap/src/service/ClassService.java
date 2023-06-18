package service;

import model.Classs;

import java.util.ArrayList;

public class ClassService {
    private ArrayList<Classs> listClass = new ArrayList<Classs>();

    private SubjectService subjectService = new SubjectService();

    public ClassService() throws InstantiationException, IllegalAccessException {
        listClass.add(new Classs(1, "JV03", subjectService.findById(1), false).getClass().newInstance());
        listClass.add(new Classs(2, "JS04", subjectService.findById(2), false));
    }

    public ArrayList<Classs> getAll() {
        return listClass;
    }

    public int getSize() {
        return listClass.size();
    }

    public void save(Classs myClass) {
        if (findById(myClass.getId
                ()) == null) {
            listClass.add(myClass);
            System.out.println("Thêm Thành công");
        } else {
            for (int i = 0; i < listClass.size(); i++) {
                if (listClass.get(i).getId
                        () == myClass.getId
                        ()) {
                    listClass.set(i, myClass);
                }
            }
            System.out.println("Sửa Thành công");
        }
    }

    public void deleteClass(int id) {
        for (int i = 0; i < listClass.size(); i++) {
            if (listClass.get(i).getId
                    () == id) {
                listClass.remove(i);
            }
        }
        System.out.println("Xóa thành công");
    }

    public Classs findById(int id) {
        for (int i = 0; i < listClass.size(); i++) {
            if (listClass.get(i).getId
                    () == id) {
                return listClass.get(i);
            }
        }
        return null;
    }

    public int getNewId() {
        int idMax = 0;
        for (Classs c : listClass) {
            if (c.getId
                    () > idMax) {
                idMax = c.getId
                        ();
            }
        }
        return idMax + 1;
    }
}

