interface A {
     void displayA();
}
interface B {
     void displayB();
}
class C implements A, B {
    public void displayA() {
        System.out.println("Display method from interface A.");
    }
    public void displayB() {
        System.out.println("Display method from interface B.");
    }
}
public class interfaceDemo {
    
    public static void main(String[] args) {
        System.out.println("This is an interface file.");
        C c = new C();
        c.displayA();
        c.displayB();
    }
}
