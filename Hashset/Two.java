import java.util.HashSet;

public class Two {
    public static void main(String[] args) {
        HashSet h= new HashSet<>();
        h.add("tarun");
        h.add("siddu");
        h.add("tarun");
        h.add(1);
        h.add(2);
        h.add(3);
        for(Object val:h){
            System.out.println(val);

        }
        
    }
    
}
