package Loops;
import java.util.*;
import java.io.*;
public class ConsonentOrVowel {
   // public static void main(String args[]){
     public void consonentOrVowel{
        Scanner scanner = new Scanner(System.in);
        
        String s;
        
        System.out.println("Enter the word");
        s=scanner.nextLine();
        int size = s.length();
        char[] ch = s.toCharArray();
        for(int i=0;i<size;i++){
            if((ch[i]>='a'&& ch[i]<= 'z')||(ch[i]>='A' && ch[i]<= 'Z')){
                switch(ch[i])
                {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println(ch[i] + " is a vowel");
                        break;
                    default:
                        System.out.println(ch[i] + " is a consonent");
                }
            }
            else{
                System.out.println("you didn't enter a letter");
            }
        }
    }
}