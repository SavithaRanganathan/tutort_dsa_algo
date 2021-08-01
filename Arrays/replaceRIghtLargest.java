import java.util.*;
import java.io.*;

class replaceRIghtLargest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    
        //replace(arr);
        System.out.println(Arrays.toString(arr));
        replaceincludingcurrent(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void replace(int[] arr){ 
        if(arr.length>1){
        int previous_ele = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
          int max=Math.max(arr[i+1],previous_ele);
          previous_ele = arr[i];
          arr[i]= max;
        }
        arr[arr.length-1]=-1;
       } 
    } 

    static void replaceincludingcurrent(int[] arr){ 
        if(arr.length>1){
        for(int i=arr.length-2;i>=0;i--){
          arr[i]=Math.max(arr[i+1],arr[i]);
        }
       } 
    }
}