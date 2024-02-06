import java.util.function.*;
public class Four {
    public static void main(String[] args) {
        String ename="Rahul Gandhi";
        Predicate<String> p= name->name.length()>5;
        System.out.println(p.test(ename));
    }

    
}
