package InterceptingFilter.example1;

public class Target {
    public void execute(String request){
       System.out.println("Executing request: " + request);
    }
 }