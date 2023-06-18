package controller;

import model.HocVien;
import service.HocVienService;

import java.util.ArrayList;

public class HocVienController {
    private HocVienService hocvienService;

    {
        try {
            hocvienService = new HocVienService();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<HocVien> getAll() {
        return hocvienService.getAll();
    }

    public int getSize() {
        return hocvienService.getSize();
    }

    public void save(HocVien hocVien) {
        hocvienService.save(hocVien);
    }

    public void deleteTeacher(int id) {
        hocvienService.deleteHocVien(id);
    }

    public HocVien findById(int id) {
        return hocvienService.findById(id);
    }

    public int getNewId() {
        return hocvienService.getNewId();
    }
}