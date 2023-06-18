package model;

import config.InputMethod;

public class User {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String number;
    private String sinh;

    public User() {
    }

    public User(int id, String username, String password, String fullName, String number, String sinh) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.number = number;
        this.sinh = sinh;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSinh() {
        return sinh;
    }



    public void setSinh(String sinh) {
        this.sinh = sinh;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", number='" + number + '\'' +
                ", sinh=" + sinh +
                '}';
    }

    public void inputData() {
        System.out.print("Nhập username:  ");
        this.username = InputMethod.InputMethods.getString();
        System.out.print("Nhập password: ");
        this.password = InputMethod.InputMethods.getString();
        System.out.print("Nhập fullName: ");
        this.fullName = InputMethod.InputMethods.getString();
        System.out.print("Nhập phoneNumber: ");
        this.number = InputMethod.InputMethods.getString();
        System.out.print("Nhập vào date of birthday: ");
        this.sinh = InputMethod.InputMethods.getString();
    }
}
