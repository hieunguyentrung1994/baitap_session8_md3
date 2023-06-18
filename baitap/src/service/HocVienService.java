package service;

import model.HocVien;

import java.util.ArrayList;

public class HocVienService {
    private ArrayList<HocVien> listHocVien = new ArrayList<HocVien>();

    private ClassService classService = new ClassService();

    public HocVienService() throws InstantiationException, IllegalAccessException {
        listHocVien.add(new HocVien(1, "vudai", "123", "pham vu dai", "098765", "12/12/1997", classService.findById(1), true));
        listHocVien.add(new HocVien(2, "hunghx", "456", "ho xuan hung", "0987654", "12/12/1999", classService.findById(1), true));
        listHocVien.add(new HocVien(3, "beccop", "789", "nguyen xuan bec", "09876543", "12/12/1991", classService.findById(2), true));
    }

    public ArrayList<HocVien> getAll() {
        return listHocVien;
    }

    public int getSize() {
        return listHocVien.size();
    }

    public void save(HocVien teacher) {
        if (findById(teacher.getId()) == null) {
            listHocVien.add(teacher);
            System.out.println("Thêm thành công");
        } else {
            for (int i = 0; i < getSize(); i++) {
                if (listHocVien.get(i).getId() == teacher.getId()) {
                    listHocVien.set(i, teacher);
                }
            }
            System.out.println("Sửa thành công");
        }
    }

    public void deleteHocVien(int id) {
        for (int i = 0; i < getSize(); i++) {
            if (listHocVien.get(i).getId() == id) {
                listHocVien.remove(i);
            }
        }
        System.out.println("Xóa thành công");
    }

    public HocVien findById(int id) {
        for (int i = 0; i < getSize(); i++) {
            if (listHocVien.get(i).getId() == id) {
                return listHocVien.get(i);
            }
        }
        return null;
    }

    public int getNewId() {
        int idMax = 0;
        for (HocVien s : listHocVien) {
            if (s.getId() > idMax) {
                idMax = s.getId();
            }
        }
        return idMax + 1;
    }
}
