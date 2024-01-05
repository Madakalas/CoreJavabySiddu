import java.util.ArrayList;
//Mention array list with type string

public class Four {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("sonia");
        enames.add("modi");
        enames.add("amithshaw");
        //String default valueis null
        enames.add(null);
        System.out.println(enames);
        for(Object ename:enames){
            System.out.println(ename);
        }
    }
    
}
