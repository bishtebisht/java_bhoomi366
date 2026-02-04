//static method

class Method {
    
    static void display() {
        System.out.println("Static method called");
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        int sum=add(a, b);
        return sum+c;
    }


    public static void main(String[] args) {
        // Calling static method without creating an instance
        Method.display();
        Method obj = new Method();
        System.out.println("Sum of 2 numbers: " + obj.add(5, 10));
        System.out.println("Sum of 3 numbers: " + obj.add(5, 10, 15));
    }
}
