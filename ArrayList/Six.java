import java.util.ArrayList;

public class Six {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList ids = new ArrayList();

        a.add(101);
        a.add(102);
        a.add(103);
        a.add(104);
        a.add(105);

        ids.add(104);
        ids.add(105);

        a.addAll(ids);

        System.err.println(a);
        System.out.println(ids);

        //Removing common elements in lists

        a.removeAll(ids);
        
        System.out.println(a);

    }
    
}
