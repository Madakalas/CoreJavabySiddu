class Grandpa {
    void m1()
    {
        System.out.println("m1-method in GP");
    }
    
}
class Parent extends Grandpa
{
    void m2()
    {
        System.out.println("m2 method in Parent");
    }
}
class Child extends Parent
{
    void m3()
    {
        System.out.println("m3 method in Child");
    }
}
class Test{
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        c.m2();
        c.m3();
    }
}
