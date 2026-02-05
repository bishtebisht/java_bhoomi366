//super class
class Person{
    String name;
    int age;

    void displayPerson(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}


class Animal{
    String species;
    String name;

    void displayAnimal(){
        System.out.println("Species: "+species);
        System.out.println("Name: "+name);
    }
}


//sub class
class Student extends Person{
    int rollNo;

    void displayStudent(){
        System.out.println("Roll No: "+rollNo);
    }
}


class Dog extends Animal{
    String owner;
    void displayDog(){
        System.out.println("owner: "+owner);
    }
}

class puppy extends Dog{

    void displayPuppy(){
        System.out.println("Woof Woof");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Student s= new Student();
        s.name = "Bhoomi";
        s.age = 19;
        s.rollNo = 16;

        s.displayPerson();
        s.displayStudent();

        puppy p= new puppy();
        p.species = "doberman";
        p.name = "Bambam";
        p.owner = "Jungkook";
        p.displayAnimal();
        p.displayDog();
        p.displayPuppy();
    }
    
}
