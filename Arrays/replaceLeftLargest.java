import java.util.*;
import java.io.*;

class replaceLeftLargest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    
        replace(arr);
        System.out.println(Arrays.toString(arr));
        //replaceincludingcurrent(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void replace(int[] arr){ 
        if(arr.length>1){
        int previous_ele = arr[0];
        for(int i=1;i<arr.length;i++){
          int max=Math.max(arr[i-1],previous_ele);
          previous_ele = arr[i];
          arr[i]= max;
        }
       } 
       arr[0]=-1;
    } 

    static void replaceincludingcurrent(int[] arr){ 
        if(arr.length>1){
        for(int i=1;i<arr.length;i++){
          arr[i]= Math.max(arr[i-1],arr[i]);
        }
       } 
    }
}