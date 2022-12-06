package com.challenges;
import java.util.Scanner;
import java.util.regex.*;

class QuestionMarks {
    public static String QuestionsMarks(String str) {

        String strWithoutLetters = str.replaceAll("[a-z]", "");

        Pattern pattern = Pattern.compile("([0-9])([?])([?])([?])([0-9])");
        Matcher match = pattern.matcher(strWithoutLetters);

        Pattern wrongPattern1 = Pattern.compile("([0-9])([?])([?])([0-9])");
        Matcher wrongMatch1 = wrongPattern1.matcher(strWithoutLetters);

        Pattern wrongPattern2 = Pattern.compile("([0-9])([?])([0-9])");
        Matcher wrongMatch2 = wrongPattern2.matcher(strWithoutLetters);

        if (wrongMatch1.find() || wrongMatch2.find()){
            return "false";
        }
        if (match.find()){
            return "true";
        }
        return "false";

    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}
