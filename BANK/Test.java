public class Test {
    public static void main(String[] args) {
        Sa a=new Sa();
        Ca b= new Ca();
        a.set_Acc_Amt(2000000);
        a.set_Min_bal(5000);

        b.set_Acc_Amt(20000);
        b.set_Min_bal(500);

        System.out.println(a.get_Acc_Amt());
        System.out.println(a.get_Min_bal());

       
        System.out.println(b.get_Acc_Amt());
        System.out.println(b.get_Min_bal());
    }
    
}
