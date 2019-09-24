package loops;
import java.util.*;
import  java.io.*;
public class  Problem4 {
    public static void  main(String args[]){
   
        Scanner scanner = new Scanner(System.in);
        int num;
        int num1=1;
        System.out.println("enter the number");
        num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(num1 + " ");
            }
            
            num1++;
        }
    }
}