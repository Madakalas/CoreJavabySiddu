import java.time.Year;


public class leap {
    public static void main(String[]args){
        java.time.Year year = Year.now();
        if(year.isLeap()){
        System.out.println("sidhu is mad");
    }else{
         System.out.println("basu is smart");
    }
}
}