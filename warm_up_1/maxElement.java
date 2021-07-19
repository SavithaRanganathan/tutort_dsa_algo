import java.util.*;
import java.io.*;


public class maxElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max = maxelement(arr);
        System.out.println(max);
    }

    static int maxelement(int[] arr){ 
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];
        int max = Integer.MIN_VALUE;
        for(int x : arr){
          if(x>max)max=x;
        }
       return max;
       } 
}