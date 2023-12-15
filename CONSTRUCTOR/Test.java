public class Test {
    public static void main(String[] args) {
        
        Sa s = new Sa();
        Ca c = new Ca();

        s.set_Max_Bal(20000);
        c.set_Max_Bal(25000);

        System.out.println(s.get_Max_Bal());
         System.out.println(c.get_Max_Bal());


    }
    
}
