import java.util.Optional;  

class OptionalEx {
    public static void main(String[] args) {
        String ename="siddu";
        Optional value= Optional.ofNullable(ename);
        if(value.isPresent()){
            System.out.println(value.get());
        }
        else{
            System.out.println("Null value");
        }
    }
    
}
