package string.charachterCounting;

//Check if the given sentence is Pangram or not

public class Pangram
{

    public static void main(String[] strings) {
        String sampleString = "The quick brown fox jumps over the lazy dog";
        boolean alphabets[] = new boolean[26];

        sampleString = sampleString.toLowerCase();
        for(int i=0;i<sampleString.length();i++)
        {
            char ch =sampleString.charAt(i);
            if(ch>='a'&& ch<='z')
                alphabets[ch-'a']=true;
        }

        for (boolean val :alphabets)
        {
            if(!val)
            {
                System.out.println("encountred a boolean value, hence the condition for Pangram is false");
            }
        }
    }


}
