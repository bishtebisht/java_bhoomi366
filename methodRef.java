import java.util.*;
public class methodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bhoomi","sneha","karun");

        //lambda exp
        names.forEach(name->System.out.println(name));

        //method reference
        names.forEach(System.out::println);

    }
}
