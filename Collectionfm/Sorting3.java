import java.util.ArrayList;
import java.util.Collections;

public class Sorting3 {
        public static void main(String[] args) {
        ArrayList <String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Chetan");
        enames.add("Priyanka");
        enames.add("Sonia");
        Collections.sort(enames);
        System.out.println(enames);
        i=0;
        while(i<enames.size()-1){
            System.out.println(enames.get(i));
            i++;
        }
       

        
    }
    
}