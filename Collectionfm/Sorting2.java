

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
        public static void main(String[] args) {
        ArrayList <String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Chetan");
        enames.add("Priyanka");
        enames.add("Sonia");
        Collections.sort(enames);
        System.out.println(enames);
        for(int i=0;i<enames.size()-1;i++){
            System.out.println(enames.get(i));
        }
       

        
    }
    
}
