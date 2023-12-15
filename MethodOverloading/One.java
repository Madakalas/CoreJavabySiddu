class One{
    public String toString(){
        return "Siddu";
    }

}
class Two extends One{

}
class Test{
    public static void main(String[] args) {
            One a = new One();
            Two t = new Two();
            System.out.println(a);
            System.out.println(t);
        
    }

}