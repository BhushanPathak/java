package com.lonely.integer;

/*There are  integers in an array . All but one integer occur in pairs. Your task is to find the number that occurs only once.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int[] a = new int[]{1,1,2,4,3,2,4};
        /*for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }*/
        System.out.println(lonelyInteger(a));
    }
    
    private static int lonelyInteger(int[] a){
        Arrays.sort(a);
        int lonelyInt=a[0];
        
        if(a.length==1){
            lonelyInt=a[0];
        }else{
            for(int i=0; i<a.length;i=i+2){
            	//System.out.println("--" + i);
                if(i+1>=a.length){
                	lonelyInt=a[i];
                	break;
                }else{
                	if(a[i]!=a[i+1]){
                        lonelyInt=a[i];
                        break;
                    }
                }
            }    
        }
        
        return lonelyInt;
    }

}
