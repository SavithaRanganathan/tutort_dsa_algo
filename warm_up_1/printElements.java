import java.util.*;
import java.io.*;

public class printElements{

public static boolean printele(int[] arr,int size){
    if (size <= 0) return false;
    for(int ele : arr){
        System.out.println(ele);
    }
    return true;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int[] arr=new int[size];
      for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
      }
      boolean res = printele(arr,size);
      
}



}