public class exp {
    //try catch finally
    // public static void main(String[] args) {
    // 
    //     try{    
    //         int a=30, b=0;    
    //         int c=a/b;  //may throw exception    
    //         System.out.println("Result = " + c);
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("Exception caught: " + e.getMessage());
    //     }
    //     finally{
    //         System.out.println("This block is always executed.");
    //     }
    // }

    //checked error & unchecked error
    //checked error:- compile time error(e.g., IOException, ClassNotFoundException)
    //unchecked error:- runtime error(e.g., ArithmeticException, NullPointerException)

    //throw
    //works for unchecked error
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
