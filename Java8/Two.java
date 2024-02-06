import java.awt.List;
import java.util.ArrayList;
import java.util.function.Function;
interface FunctionI{
    public int apply(List enames);
}
public class Two {
    public static void main(String[] args) {
        ArrayList enames = new ArrayList();
        enames.add("siddu");
        enames.add("Basu");
        FunctionI obj= names->names.size();
        System.out.println(obj.apply(enames));
    }
    
}
