class Animal{
    String species;
    String name;
    void displayAnimal(){
        System.out.println("Species: "+species);
        System.out.println("Name: "+name);
    }
}
class Dog extends Animal{
    String owner;
    void displayDog(){
        System.out.println("owner: "+owner);
    }
}
class Cat extends Animal{
    String owner;
    void displayCat(){
        System.out.println("owner: "+owner);
    }
}
public class hier_inheritance {

    
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c= new Cat();
        d.species = "doberman";
        c.species = "calico";
        d.name = "Bambam";
        c.name = "Luna";
        d.owner = "Jungkook";
        c.owner = "Jimin";
        d.displayAnimal();
        d.displayDog();
        c.displayAnimal();
        c.displayCat();
    }
}
