package com.challenges;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodelandUsernameValidation {
    public static String ValidateUsername (String username) {
        String regex = "^[A-Za-z]\\w{3,24}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(username);
        if(username.endsWith("_")){
            return "false";
        }
        if(m.matches() == false){
            return "false";
        }
        return "true";
    }
    public static void main(String[] args) {
        CodelandUsernameValidation validation = new CodelandUsernameValidation();
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println(ValidateUsername(username));
    }
}





