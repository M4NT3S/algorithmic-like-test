import java.util.*;
public class Main {
    public static void main(String[] args) {
      try{
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(string);
        string = string + scanner.next();
      } catch(Exception e){
        System.out.println("An error was found ");
      }
      
    }
}
