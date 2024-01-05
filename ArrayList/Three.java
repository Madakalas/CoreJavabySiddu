import java.util.ArrayList;
//mention the type as integer

public class Three {
    public static void main(String[] args) {
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(104);
        //ids.add("rahul")-returns error
        System.out.println(ids);
        for(Object id:ids){
            System.out.println(id);
        }
    }
    
}
