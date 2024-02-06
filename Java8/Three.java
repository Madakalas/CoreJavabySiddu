
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
public class Three {
    public static void main(String[] args) {
        ArrayList enames = new ArrayList();
        enames.add("siddu");
        enames.add("Basu");
        Function<List,Integer> rg = names->names.size();
        System.out.println(rg.apply(enames));
    }
    
}
