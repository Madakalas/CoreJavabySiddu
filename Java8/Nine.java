import java.util.ArrayList;
import java.util.function.*;;

public class Nine {
    public static void main(String[] args){
        ArrayList enames=new ArrayList<>();
        enames.add("siddu");
        enames.add("tarun");
        Function<List,Integer> rg = names->names.size();
        System.out.println(rg.apply(enames));
    }
    
}
