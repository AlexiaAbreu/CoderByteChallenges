package com.challenges;

public class LongestWord {

    public static String LongestWord(String sen){

        String [] parts = sen.replaceAll("[^A-Za-z0-9\s]", "").split(" ");;
        String longestWord = "";

        for(int i = 0; i < parts.length; i++){
            if(parts[i].length() > longestWord.length()){
                longestWord = parts[i];
            }
        }
        sen = longestWord;
        return sen;
    }

    public static void main(String[] args) {
    String resultado = LongestWord("  @i@alex!a oiAlexia");
    System.out.println(resultado);

    }
}
