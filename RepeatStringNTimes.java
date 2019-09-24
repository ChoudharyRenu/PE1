package Loops;
import java.util.*;
import java.io.*;
public  class RepeatStringNTimes {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num;
        String s;
        System.out.println("enter the String:");
        s=scanner.nextLine();
        System.out.println("Enter the number of times the string shoud be repeated:");
        num=scanner.nextInt();
        int size=s.length();
        char[] ch=new char[size];
        for(int i=size-num;i<size;i++){
            ch[i]=s.charAt(i);
        }
        System.out.print(s);
        for(int i=0;i<num;i++){
            System.out.print(ch);
        }
    }
}