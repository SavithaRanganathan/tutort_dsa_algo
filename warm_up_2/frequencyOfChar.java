import java.util.*;
import java.io.*;

public class frequencyOfChar{
public static void frequency(char[] arr){
   int[] frequency=new int[256];
   
    for(int i=0;i<arr.length;i++){
        frequency[arr[i]]++;
    }
    
    for(int i=0;i<256;i++){
        if(frequency[i]>0)
        System.out.println((char) i+":"+frequency[i]);
    }

   }



public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      String arr = sc.nextLine();
    
      frequency(arr.toCharArray());
}



}