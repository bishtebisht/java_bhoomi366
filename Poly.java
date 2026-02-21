//BHOOMI BISHT 2400320100366
class calculator {
    int add(int a, int b) {
        return a + b;
    }
    float add(float a, float b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Poly {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println("Sum of 2 integers: " + c.add(5, 10));
        System.out.println("Sum of 2 floats: " + c.add(5.5f, 10.5f));
        System.out.println("Sum of 3 integers: " + c.add(5, 10, 15));
    }
}
