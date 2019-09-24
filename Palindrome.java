package Loops;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("enter the number:");
        s=scanner.nextLine();
        char[] ch=s.toCharArray();
        //char[]  ch1  = new char[size];
        int sum=0;
        int size=s.length();
        for(int i=0;i<=size/2;i++){
            if(ch[i]!=ch[size-i-1]){
                System.out.println("not a palindrome number");
                return;
            }
            
        }
        for(int i=0;i<size;i++){
            int temp= Character.getNumericValue(ch[i]);
            if(temp%2==0){
                sum+=temp;
            }
        }
        if(sum>25){
            System.out.println(s+" is a palindrome number and "+"sum of even numbers is greater than 25");
        }
        else{
            System.out.println(s+" is a palindrome number and "+"sum of even  numbers is less than 25");
        }
    }

}