package com.challenges;


import java.util.*;


public class FirstReverse {

    public static List<Character> ConvertStringToCharacters (String str){
        List<Character> chars = new ArrayList<Character>();
        for (char ch : str.toCharArray()){
            chars.add(ch);
        }
        return chars;
    }

    public static String FirstReverse(String str){
        List<Character> charList = ConvertStringToCharacters(str);
        List<Character> reverseCharList = new ArrayList<Character>();
       for(int i = charList.size() - 1; i >= 0; i--){
           reverseCharList.add(charList. get(i));
       }
        StringBuilder sb = new StringBuilder();

        for (Character ch : reverseCharList){
            sb.append(ch);
        }
        String string = sb.toString();
        return string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(FirstReverse(str));
    }

}


