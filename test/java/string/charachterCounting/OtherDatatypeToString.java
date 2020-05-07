package string.charachterCounting;

public class OtherDatatypeToString {

    public static void main(String[] args)
    {

        String myShort              = "5000";
        String myNum                = "5";            // Integer (whole number)
        String myLong               = "15000000000L";
        String myFloatNum           = "5.99f";        // Floating point number
        String myDouble             = "19.99d";
        String myLetter             = "D";            // Character
        String myBool               = "true";         // Boolean


        System.out.println("String to Short         : "+Short.parseShort(myShort));
        System.out.println("String to Integer       : "+Integer.parseInt(myNum));
       // System.out.println("String to Long          : "+Long.parseLong(myLong));
        System.out.println("String to Float         : "+Float.parseFloat(myFloatNum));
        System.out.println("String to Double        : "+Double.parseDouble(myDouble));
        System.out.println("String to Boolean       : "+Boolean.parseBoolean(myBool));
        //System.out.println("String to Character     : "+Character.);
    }
}
