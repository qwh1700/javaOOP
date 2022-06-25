import model.Student;


public class Class {

    public static void main(String[] args) {
        Student student = new Student("jack",18,"man","00215");
        System.out.print(student.getName());
        System.out.print(student.getAge());
        System.out.print(student.getGender());
        System.out.print(student.getID());
    }
}