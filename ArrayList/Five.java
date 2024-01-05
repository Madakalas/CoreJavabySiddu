import java.util.ArrayList;

public class Five {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList ids = new ArrayList();

        a.add(101);
        a.add(102);
        a.add(103);

        ids.add(104);
        ids.add(105);

        System.err.println(a);
        System.out.println(ids);

        //combining both lists
        a.addAll(ids);

        System.out.println(a);

    }
    
}
