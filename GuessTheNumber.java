package Loops;
import java.util.*;
import java.io.*;
public class GuessTheNumber {
    public static void main(String args[]){
        int num  = 33;
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Guess the number: ");
        n=scanner.nextInt();
        
        if(n>33){
            System.out.println("Entered number is greater than the original number");
        }
        else if(n<33){
            System.out.println("Entered number is less than the original number");
        }
        else{
            System.out.println("Correct guess");
            break;
        }
    }while(n!=num);
    }
}