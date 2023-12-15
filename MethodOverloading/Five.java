class Five {
    
}
class Account extends Five{

}
class Check{
    public static void main(String[] args) {
        Five f = new Five();
        Account a = new Account();
        System.out.println(f==a);
        System.out.println(f.equals(a));
    }
}
