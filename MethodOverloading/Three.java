class Bank {

    
}
class Account{

}
class Test{
    public static void main(String[] args) {
        Bank b = new Bank();
        Bank C = new Bank();
        Account  a = new Account();
        Account d = new Account();
        System.out.println(b.equals(C));
        System.out.println(a.equals(d));

    }
}
