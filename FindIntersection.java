package com.challenges;

import java.util.*;
import java.io.*;

class FindIntersection {

    public static String FindIntersection(String[] strArr) {
        String result = "";
        String[] strArr1 = strArr[0].split(", ");
        String[] strArr2 = strArr[1].split(", ");
        for(int i= 0; i < strArr1.length; i++){
            for(int j = 0; j < strArr2.length; j++){
                if(strArr1[i].equals(strArr2[j])){
                    result = result + strArr1[i] + ",";
                }
            }
        }
        if(result.length()!=0){
            return result.substring(0, result.length()-1);
        }
        else{
            return "false";
        }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(FindIntersection(s.nextLine()));
    }

}