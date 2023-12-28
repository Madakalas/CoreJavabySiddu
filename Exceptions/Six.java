// we cannot use finally without try block 
public class Six {
    public static void main(String[] args)throws ArithmeticException {
        System.out.println(10/2);
        throw new ArithmeticException("/solved");
        finally{
            System.out.println(10/5);
        }
    }
    
}
