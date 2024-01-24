import java.util.LinkedList;

public class Three {
    public static void main(String[] args) {
        LinkedList l= new LinkedList<>();
        l.add(20);
        l.add("siddu");
        l.add("makar");
        System.out.println(l);

        int i=0;
        while(i<l.size()-1){
            System.out.println(l.get(i));
            i++;
        }
        }

    }
    
