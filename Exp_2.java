
public class Exp_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // int a=Integer.parseInt(args[1]);
        // int b=Integer.parseInt(args[2]);
        // int sum=a+b;
        // System.out.println(sum);

        int n = Integer.parseInt(args[0]);
		int temp = n;
		int rev = 0;
		while(temp!=0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		if(rev == n) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not Palindrome number");
		}
    }

}

