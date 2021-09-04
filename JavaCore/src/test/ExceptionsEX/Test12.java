package test.ExceptionsEX;

public class Test12 {
    public static void main(String[] args) {

    }
    public void createPwd(String pwd){
        if (pwd.length() < 6 ){
            throw new IllegalArgumentException("very short");
        }
        if (pwd.length() > 12 ){
            throw new IllegalArgumentException("very long");
        }
        System.out.println("Good");
    }
}
class Plane{
    String plane = "waiting";
    public void fly(){
        plane = "fly";
        System.out.println("plane fly");
    }
    public void waiting(){
       if (plane.equals("fly")){
           throw new IllegalStateException("plane already fly");
       }
        plane = "waiting";
        System.out.println("plane waiting");
    }
    public void cancelFly(){
        if (plane.equals("fly")){
            throw new IllegalStateException("plane already fly");
        }
        plane = "plane canceled";
        System.out.println("plane canceled");
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.waiting();
        plane.fly();
        plane.cancelFly(); 
    }
}
