package org.example;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "AutomationTest";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.print(rev);
    }
}
