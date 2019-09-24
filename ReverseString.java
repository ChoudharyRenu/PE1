package Loops;
import java.io.*;
import java.util.*;
public class ReverseString{
        public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
        String s=new String();
        System.out.println("Enter the string:-");
        s=scanner.nextLine();
        int size=s.length();
        char[] ch= s.toCharArray();
        //System.out.println(ch);
        System.out.println(size);
        char temp;
        for(int i=0;i<=size/2;i++){
            temp=ch[i];
            //System.out.println("ch["+ i + "]"+ "="+ch[i]);
            //System.out.println("ch["+ (size-i-1) + "]"+ "="+ch[size-i-1]);
            ch[i]=ch[size-i-1];
            ch[size-i-1]=temp;
        }
        System.out.println(ch);
}
}