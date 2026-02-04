import java.util.Scanner;

public class Exp_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        //conditional statement
        if(x>5){
            System.out.println("greater than 5");
        }
        else System.out.println("smaller than 5");
        //loops
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
