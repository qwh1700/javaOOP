package model;

public class Student {
    String name;
    int age;
    String gender;
    String ID;

    public Student(String name, int age, String gender, String ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
