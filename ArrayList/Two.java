import java.util.ArrayList;

public class Two {
    public static void main(String[] args) {
        ArrayList enames = new ArrayList();
        //Allow heterogeneous
        //Allow duplicates
        //Allow increasing/decrement
        enames.add(101);
       enames.add("Rahul");
        enames.add(true);
        enames.add(2000.00);
        enames.add(101);
        System.out.println(enames);
        //we neeed to mention type as object
        for(Object ename:enames){
            System.out.println(ename);

        }
    }
    
}
