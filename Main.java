//BHOOMI BISHT 2400320100366
class Student {
    int rollno;
    String name;
    String course;
    int fee;

    Student(int rollno, String name, String course, int fee){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }
    void display(){
        System.out.println("RollNo : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("Course : "+course);
        System.out.println("Fee : "+fee);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John", "Java", 5000);
        Student s2 = new Student(102, "Jane", "Python", 6000);
        Student s3 = new Student(103, "Doe", "C++", 5500);

        s1.display();
        s2.display();
        s3.display();
    }
}



