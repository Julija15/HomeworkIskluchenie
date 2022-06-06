import java.io.IOException;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) throws Exception {
        String document = "1234-abc-6549-mcn-8r9t";
        System.out.println(document);

        StringBuilder document1 = new StringBuilder();
        document1.append("1234 -").append(" 6549");
        System.out.println(document1);

        String s = document.replace("abc", "***");
        System.out.println(s.replace("mcn", "***"));

        StringBuilder document2 = new StringBuilder();
        document2.append("abc-").append("mcn-").append("r-").append("t");
        System.out.println(document2);

        String s2 = String.valueOf(document2);
        String s3 = s2.replace("-", " / ");
        System.out.println(s3);

        String s4 = s3.toUpperCase();
        System.out.println(s4);

        System.out.println("Letters: " + s4);

        //содержит ли номер документа последовательность abc
            boolean isContain1;
            if (isContain1 = document.contains("abc")){
            throw new Exception();
        }


        boolean isContain2 = document.contains("ABC");
        System.out.println(isContain2);

        // начинается ли строка с 555
        if (document.startsWith("555")) {
            throw new Exception();
        }

        // заканчивается 1a2b
        if (document.endsWith("1a2b")) {
            throw new Exception();
        }

        // Дана произвольная строка с произвольными словами. Найти самое короткое и самое длинное слово

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] sentenceArr = sentence.split(" ");
        String min = sentenceArr[0];
        String max = "";
        for (String e : sentenceArr) {
            if (e.length() < min.length()) {
                min = e;
            }
            if (e.length() > max.length()) {
                max = e;
            }
        }
        System.out.print(" Min:" + min);
        System.out.println(" Max:" + max);


        // новая строка, где задублированная каждая буква
        String text = "Hello";
        int n = 2;
        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < n; j++) {
                repeat.append(text.charAt(i));
            }
        }
        System.out.println(repeat);
    }
}



