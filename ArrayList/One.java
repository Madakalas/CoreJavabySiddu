import java.util.ArrayList;

public class One {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        //Allow heterogeneous
        //Allow duplicates
        //Allow increasing/decrement
        a.add(101);
        a.add("Rahul");
        a.add(true);
        a.add(2000.00);
        a.add(101);
        System.out.println(a);
    }
    
}
