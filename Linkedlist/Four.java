package CoreJavabySiddu.Linkedlist;

import java.util.LinkedList;

public class Four {
     public static void main(String[] args) {
        LinkedList l= new LinkedList<>();
        l.add(20);
        l.add("siddu");
        l.add("makar");
        System.out.println(l);
        l.addFirst(200);
        l.addLast(900);
        System.out.println(l);
        l.removeFirst(200);
        l.removeLast(900);

        int i=0;
        while(i<l.size()-1){
            System.out.println(l.get(i));
            i++;
        }
        }
    
}
