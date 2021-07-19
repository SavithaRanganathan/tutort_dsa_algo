import java.util.*;
import java.io.*;


public class minElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int min = minelement(arr);
        System.out.println(min);
    }

    static int minelement(int[] arr){ 
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];
        int min = Integer.MAX_VALUE;
        for(int x : arr){
          if(x<min)min=x;
        }
       return min;
       } 
}