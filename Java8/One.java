import java.util.ArrayList;
interface Rg{
    public abstract int apply(int size,ArrayList enames){
        return enames.size();
    }
}
public class One implements Rg{
    public static void main(String[] args) {
        ArrayList enames=new ArrayList();
        enames.add("siddu");
        enames.add("Basu");

       System.out.println(Rg.One(enames.size()));


    }
}