package string.charachterCounting;

public class StringToOtherDataTypes {


public static void main(String[] args)
{
    short myShort           = 5000;
    int myNum               = 5;            // Integer (whole number)
    long myLong             = 15000000000L;
    float myFloatNum        = 5.99f;        // Floating point number
    double myDouble         = 19.99d;
    char myLetter           = 'D';          // Character
    boolean myBool          = true;         // Boolean



    printShortToString( myShort);
    printIntToString( myNum);
    printLongToString( myLong);
    printFloatToString( myFloatNum);
    printDoubleToString( myDouble);
    printCharToString( myLetter);
    printBooleanToString( myBool);
}

    private static void printBooleanToString(boolean myBool) {
        System.out.println(String.valueOf(myBool));
    }

    private static void printCharToString(char myLetter) {
        System.out.println(String.valueOf(myLetter));
    }

    private static void printDoubleToString(double myDouble) {
        System.out.println(String.valueOf(myDouble));
    }

    private static void printFloatToString(float myFloatNum) {
        System.out.println(String.valueOf(myFloatNum));
    }

    private static void printLongToString(long myLong) {
        System.out.println(String.valueOf(myLong));
    }

    private static void printIntToString(int myNum) {
        System.out.println(String.valueOf(myNum));
    }

    private static void printShortToString(short myShort) {
        System.out.println(String.valueOf(myShort));
    }



}

