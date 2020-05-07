package string.charachterCounting;

import java.util.Scanner;

public class OnlyWhiteSpace {

    public static void main(String[] args)
    {
        String sampleText;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter sample string");
        sampleText = scanner.nextLine();
         String s1=sampleText.trim();
        if(s1.isEmpty())
            System.out.println("all are spaces");
        else
            System.out.println("all chars in String are not spaces");


    }

}
