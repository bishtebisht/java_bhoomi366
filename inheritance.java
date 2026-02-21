//BHOOMI BISHT 2400320100366
//super class
class Person{
    String name;
    int age;
    void displayPerson(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
//sub class
class Student extends Person{
    int rollNo;
    String course;
    void displayStudent(){
        System.out.println("Roll No: "+rollNo);
        System.out.println("Course: "+course);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Student s= new Student();
        s.name = "Bhoomi";
        s.age = 19;
        s.rollNo = 16;
        s.course = "Btech";
        s.displayPerson();
        s.displayStudent();
    }
}
