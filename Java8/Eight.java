import java.util.function.Function;
import java.util.function.Predicate;
import java.awt.List;
import java.util.ArrayList;
public class Eight {
    public static void main(String[] args) {
        ArrayList enames = new ArrayList<>();
        enames.add("siddu");
        Predicate<List> p = names->names.isEmpty();
        System.out.println(p.test(enames));
        
    }


    
}
