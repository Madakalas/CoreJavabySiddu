interface InterTest{
    boolean test(String name);
}

public class Six implements InterTest {
    public boolean test(String name){
        return name.length()>5;
    }
    public static void main(String[] args) {
        InterTest p= new Six();
        System.out.println(p.test("RahulGandhi"));

    }

    
}
