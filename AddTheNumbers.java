import java.util.*;
public class AddTheNumbers{
    public static void  main(String args[]){
       Scanner scanner = new Scanner(System.in);
     // public  void addTheNumbers{ 
      int sum=0;
        while(scanner.hasNextInt()){
            sum+=scanner.nextInt();
        
        }
        
        System.out.println(sum);
        if(scanner.hasNext()){
            System.out.println("Enter an integer");}
    }
}
