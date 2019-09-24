package Loops;
import java.util.*;
import java.io.*;
import java.lang.*;
public class UpperOrLowerCase {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //String s;
        char c;
        System.out.println("Enter the character: ");
        c=scanner.next().charAt(0);
        //c= s.charAt(0);
        scanner.close();
        
        if(c>='a'&&c<='z')
        {
            System.out.println(c + " is lower case");
        }
        else  if(c >= 'A' && c <= 'Z')
        {
            System.out.println(c + " is upper case");
        }
        else if( c>='0' && c <=  '9')
        {
            System.out.println(c + " is a digit");
        }
        else
        {
            System.out.println(c + " is a special case");
        }

    }
}