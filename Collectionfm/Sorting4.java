package CoreJavabySiddu.Collectionfm;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting4 {
            public static void main(String[] args) {
        ArrayList <String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Chetan");
        enames.add("Priyanka");
        enames.add("Sonia");
        Collections.sort(enames);
        System.out.println(enames);
        for(String ename:enames){
            System.out.println(ename);
        }

        }
       

        
    }
