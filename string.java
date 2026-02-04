public class string {
    String str1="Hello";
    String str2=new String(" World");
    void display(){
        System.out.println(str1+str2);
    }
    public static void main(String[] args) {
        string obj=new string();
        obj.display();

        String str3="Java".concat(" Programming");
        System.out.println(str3);
        System.out.println("Length of str3: "+str3.length());

        System.out.println(str3.trim().toUpperCase());   
        System.out.println(str3.indexOf("Java"));          
        System.out.println(str3.substring(1,6));           
        System.out.println(str3.replace("Java", "World"));    
        System.out.println(String.join("-", "a","b","c"));  
    
    }
}
