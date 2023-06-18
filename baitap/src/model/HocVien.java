package model;

import config.InputMethod;

import java.util.ArrayList;
import java.util.Date;

public class HocVien extends User{
    private Classs classes;
    private boolean status = true;

    public HocVien(int id, String vudai, String number, String phamVuDai, String s, String s1, Classs byId, boolean status) {

    }

    public HocVien(Classs classes, boolean status) {
        this.classes = classes;
        this.status = status;
    }

    public HocVien(int id, String username, String password, String fullName, String number, Date sinh, Classs classes, boolean status) {
        super(id, username, password, fullName, number, String.valueOf(sinh));
        this.classes = classes;
        this.status = status;
    }

    public HocVien() {

    }

    public Classs getClasses() {
        return classes;
    }

    public void setClasses(Classs classes) {
        this.classes = classes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "classes=" + classes +
                ", status=" + status +
                '}';
    }
    public void inputData(ArrayList<Classs> classes) {
        super.inputData();
        for (Classs c : classes) {
            System.out.println("--------------------------------");
            System.out.println("ID: " + c.getId() + " | ClassName: " + c.getClassName());
        }
        while (true) {
            System.out.print("Nhập vào ID lớp bạn muốn chọn: ");
            int id = InputMethod.InputMethods.getInteger();
            boolean flag = false;
            for (Classs c : classes) {
                if (c.getId() == id) {
                    this.classes = c;
                    flag = true;
                }
            }
            if (!flag) {
                System.err.print("Không có lớp đó, Vui lòng nhập lại: ");
            } else {
                break;
            }
        }
    }

}
