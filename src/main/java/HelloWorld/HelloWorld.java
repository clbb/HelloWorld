package HelloWorld;

public class HelloWorld {
    public String say(){
        return "hello maven";
    }
    public static void main(String[] args){
        System.out.print(new HelloWorld().say());
    }
}
