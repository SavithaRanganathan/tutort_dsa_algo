import java.util.*;
import java.io.*;


public class minmaxElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int[] res=new int[2];
        res = findMinMax(arr);
        System.out.println(res[0]+" "+res[1]);
    }

    static int[] findMinMax(int[] arr){ 
        if (arr.length == 0) return null;
        int[] result=new int[2];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MIN_VALUE;
        for(int x : arr){
          if(x<result[0])result[0]=x;
          if(x>result[1])result[1]=x;
        }
        
       return result;
       } 
}