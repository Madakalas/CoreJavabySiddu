class Bank  {
}
class Account extends Bank{

}
class Five{
    public static void main(String[] args) {
        Bank b = new Bank();
        Account a = new Account();
        System.out.println(b==a);
        

    }
    
}
