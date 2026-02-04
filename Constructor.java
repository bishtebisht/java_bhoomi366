//Constructor overloading
public class Constructor {
    int id;
    String name;
    //constructor (default)
    Constructor()
    {
        id=100;
        name="abc";
    }
    Constructor(int i,String n) // Parameterized constructor
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        Constructor s1=new Constructor(10,"BHOOMI");
        Constructor s2=new Constructor();
        s1.display();
        s2.display();
    }
}