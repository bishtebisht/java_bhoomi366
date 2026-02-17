public class exp {
    public static void main(String[] args) {
        //try catch finally
        try{    
            int a=30, b=0;    
            int c=a/b;  //may throw exception    
            System.out.println("Result = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("This block is always executed.");
        }

    }
}
