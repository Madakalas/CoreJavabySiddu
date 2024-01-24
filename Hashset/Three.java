import java.util.HashSet;

public class Three {
    public static void main(String[] args){
        HashSet h = new HashSet<>();
        HashSet x = new HashSet();
        h.add(20);
        h.add(30);
        h.remove(20);
        h.clear();
        h.add(90);
        h.contains(90);
        h.isEmpty();
        h.containsAll(x);
        h.addAll(x);
        
    }
    
}
