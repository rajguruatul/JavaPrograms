package string.charachterCounting;

import java.util.Scanner;

public class EvenLengthString {

    public static void main(String[] args)
    {
        String sampleText;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a sample string");
        sampleText = scanner.nextLine();


        String strArray[]=sampleText.split(" ");

        for(String s1:strArray)
        {
            if(s1.length()%2==0)
                System.out.println(s1);
        }

    }
}
