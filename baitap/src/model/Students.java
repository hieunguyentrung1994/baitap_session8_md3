package model;

import config.InputMethod;

import java.util.ArrayList;
import java.util.Date;

public class Students extends User {
    private Subject subject;
    private Classs myClass;
    private boolean status = false;

    public Students(int id, String binhpham, String binh1, String phamTuanBinh, String number, String s, Subject subject, Classs myClass, boolean status) {
        this.subject = subject;
        this.myClass = myClass;
        this.status = status;
    }

    public Students(int id, String username, String password, String fullName, String number, Date sinh, Subject subject, Classs myClass, boolean status) {
        super(id, username, password, fullName, number, String.valueOf(sinh));
        this.subject = subject;
        this.myClass = myClass;
        this.status = status;
    }
    public Students() {
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Classs getMyClass() {
        return myClass;
    }

    public void setMyClass(Classs myClass) {
        this.myClass = myClass;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Students{" +
                "subject=" + subject +
                ", myClass=" + myClass +
                ", status=" + status +
                '}';
    }
    public void inputData(ArrayList<Classs> classes) {
        super.inputData();

        // nhập lớp muốn chọn
        for (Classs c : classes) {
            System.out.println("ID: " + c.getId() + " | Class: " + c.getClassName());
        }
        while (true) {
            System.out.print("Nhập vào ID lớp bạn muốn chọn: ");
            int id = InputMethod.InputMethods.getInteger();
            Classs flag = null;
            for (Classs c : classes) {
                if (c.getId() == id) {
                    flag = c;
                }
            }
            if (flag == null) {
                System.err.print("\nKhông có lớp đó, Vui lòng nhập lại: ");

            } else {

                this.myClass = flag;
                this.subject=flag.getSubject();

                break;

            }
        }
    }
}
