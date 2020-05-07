package string.charachterCounting;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class PadString {

    public static void main(String[] args) throws IOException {
        String sampleText;
        char ch = '-';
        int length;

        Scanner scanner = new Scanner(System.in);
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter length for string");
        length=scanner.nextInt();

        System.out.println("Enter a string with length less than : "+length);
        //sampleText = scanner.nextLine();
        sampleText = ob.readLine();

        if(!(sampleText.length()<length))
            System.out.println("Please enter string of correct length again");

        else {

            usingForLoop(sampleText,length,ch);
            System.out.println("\n");
            usingStringUtils(sampleText,length,ch);

        }

    }

    public static void usingForLoop(String sampleText, int length,char ch)
    {
        System.out.print("Left padding \n");
        //left padding:
        for (int i = 0; i <(length-sampleText.length());i++)
            System.out.print(ch);
        System.out.println(sampleText);


        System.out.print("Right padding \n");
        //right padding:
        System.out.print(sampleText);
        for (int i = 0; i <(length-sampleText.length());i++)
            System.out.print(ch);

        System.out.print("\nCenter padding\n");
        for (int i=0;i<(length-sampleText.length())/2;i++)
            System.out.print(ch);
        System.out.print(sampleText);
        for (int i=0;i<(length-sampleText.length())/2;i++)
            System.out.print(ch);
    }

    public static void usingStringUtils(String sampleText, int length,char ch)
    {

        System.out.println(StringUtils.leftPad(sampleText,length,ch));
        System.out.println( StringUtils.rightPad(sampleText,length,ch));
        System.out.println( StringUtils.center(sampleText,length,ch));




    }
}
