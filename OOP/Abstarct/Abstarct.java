abstract class Siddu
{
    public void m1()
    {
         System.out.println("Abstarct Working through child");

    }
}
class Raja extends Siddu
{
    public static void main(String[] args) {
        Raja r = new Raja();
        r.m1();
    }
}
