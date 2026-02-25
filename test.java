interface add{
    int sum(int a,int b);
}
public class test {
    public static void main(String[] args){
        //lambda expression
        add obj =(a,b)->a+b;
        System.err.println(obj.sum(5,7));
    }
}
