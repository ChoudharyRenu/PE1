package Loops;
import  java.util.*;
import java.io.*;
import java.lang.*;

public class SortTheNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num,num1,temp;
        System.out.println("Enter the number:");
        num = scanner.nextInt();
        num1=num;
        int size=1;
        while(num1/10!=0){
            size++;
            num1=num1/10;
        }
       // System.out.println(size);
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=num%10;
            num=num/10;
            //System.out.println(arr[i]);
        }
        Arrays.sort(arr); 
       int sum=0;
        for(int i=0;i<size;i++){
            System.out.print(arr[size-i-1]);
            if(arr[size-i-1]%2==0){
                sum+=arr[size-i-1];
            }
        }
        System.out.println();
        System.out.println(sum);
        if(sum>15){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }


    }
}