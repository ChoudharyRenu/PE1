package Loops;
import java.util.*;
import java.io.*;
public class OddEven {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("enter the number:");
        num= scanner.nextInt();
        scanner.close();
        if(num%2!=0 && num>20 && num<30){
            System.out.println("Tom");
        }
        else if(num%2==0 && num>20 && num<30 ){
            System.out.println("Jerry");
        }
        else{
            System.out.println("number not in the range of 20 to 30");
        }
        
    }
}