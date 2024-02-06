import java.util.ArrayList;

@FunctionalInterface
interface  FunctionI {
    public int apply(List enames);

    
}
public class Inter {
    public static void main(String[] args) {
        ArrayList enames = new ArrayList<>();
        enames.add("siddu");
        FunctionI obj=names->names.size();
        System.out.println(obj.apply(enames));
    }
    
}
