public class Inc {
    // //private variable
    // private int rollNo;
    // private String name;
    // private int marks;

    // //method to set the values of the variables
    // public void setData(int rollNo, String name, int marks) {
    //     //this keyword is used to refer to the current object
    //     this.rollNo = rollNo;
    //     this.name = name;
    //     this.marks = marks;
    // }

    // public int getRollNo() {
    //     return rollNo;
    // }
    // public String getName() {
    //     return name;
    // }clear
    // public int getMarks() {
    //     return marks;
    // }

    // public static void main(String[] args) {
    //     Inc student1 = new Inc();
    //     student1.setData(1, "John", 85);

    //     System.out.println("Roll No: " + student1.getRollNo());
    //     System.out.println("Name: " + student1.getName());
    //     System.out.println("Marks: " + student1.getMarks());
    // }

    private String name;
    private int salary;

    public void setData(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        if (salary > 100000) {
            return -1;
        }
        return salary;
    }

    public static void main(String[] args) {
        Inc employee1 = new Inc();
        employee1.setData("Alice", 120000);

        System.out.println("Name: " + employee1.getName());
        int salary = employee1.getSalary();
        if (salary == -1) {
            System.out.println("Salary exceeds the limit.");
        } else {
            System.out.println("Salary: " + salary);
        }
    }



}
