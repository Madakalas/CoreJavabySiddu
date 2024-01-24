import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting5 {
        public static void main(String[] args) {
        ArrayList <String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Chetan");
        enames.add("Priyanka");
        enames.add("Sonia");
        Collections.sort(enames);
        System.out.println(enames);
        Iterator itr =enames.iterator();
        while (itr.hasNext()) {
                System.out.println(itr.next());
                
        }

        }

        }
