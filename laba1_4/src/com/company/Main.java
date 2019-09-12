package com.company;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести целые числа через пробел: ");
        String s = scanner.nextLine();
        int sum = 0;
        int ymn =1;

        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(s);

        while (m.find()) {
            sum += Integer.parseInt(m.group(1));
            ymn *= Integer.parseInt(m.group(1));
        }
        System.out.printf("Произведение введённых чисел: " + sum);
        System.out.printf("Произведение введённых чисел: " + ymn);

    }
}