package string.charachterCounting;

/*Count Uppercase, Lowercase, special character and numeric values*/

import java.util.Scanner;

public class CountCases
{


    public static void main(String[] args)
    {
       int upperCase=0;
       int lowerCase=0;
       int numbers=0;
       int specialCharacters=0;
       String sampleString;
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a valid String");
        //sampleString=scanner.nextLine();
        sampleString="#GeeKs01fOr@gEEks07";

        for(int i=0;i<sampleString.length();i++)
        {
            char ch=sampleString.charAt(i);
            if(ch>='0' && ch<='9')
                numbers++;
            else if(ch>='A' && ch<='Z')
                upperCase++;
            else if(ch>='a' && ch<='z')
                lowerCase++;
            else
                specialCharacters++;

        }



        System.out.println(" String entered is: "+sampleString);
        System.out.println("Total length:"+sampleString.length());
        System.out.println("Total count for each character type is :");
        System.out.println(" Number : "+numbers+" | lowerCase: "+lowerCase+" | UpperCase :"+upperCase+" | specialChars :"+specialCharacters);



    }





}
