import java.util.*;
import java.io.*;

public class reverseString{

 public static void reverse(char[] arr) 
 { 
        char[] temp = new char[arr.length];
        for(int i = arr.length-1,j=0;i>=0;i--,j++){
            temp[j] = arr[i];
        }
        arr = temp;
        System.out.println(arr);
 } 

 public static void reverse2(char[] arr) 
 { 
        char temp;
        for(int i = arr.length-1,j=0;i>=j;i--,j++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }
        System.out.println(arr);
 } 
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      String arr = sc.nextLine();
    
      reverse(arr.toCharArray());
      reverse2(arr.toCharArray());

      
}



}