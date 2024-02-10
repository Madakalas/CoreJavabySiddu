
import java.util.Optional;  

class Nulling {
    public static void main(String[] args) {
        String ename=null;
        Optional value= Optional.ofNullable(ename);
        if(value.isPresent()){
            System.out.println(value.get());
        }
        else{
            System.out.println("Null value");
        }
    }
    
}
