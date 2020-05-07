package string.charachterCounting;

import java.util.Scanner;

public class StringNull {


    public static void main(String[] args )
    {
        String sampleText=null;

        Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter a String");
        //sampleText = scanner.nextLine();

        if(sampleText==null)
            System.out.println("String is null");
        else
            System.out.println("String is not null and the content of String is : "+ sampleText);
    }
}
