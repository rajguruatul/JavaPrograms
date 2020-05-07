package string.charachterCounting;

/*Print number of words, vowels and frequency of each character*/

import java.util.HashMap;
import java.util.Map;

public class CountWordsVowelsChars {
    public static void main(String[]  args)
    {
        int                         vowelCount=0;
        int                         wordCount=0;
        int                         upperCaseCount=0;
        String                      sampleString="How Good GOD Is." ;


        vowelCount=countVowel(sampleString);
        wordCount=countWords(sampleString);
        upperCaseCount=countUpperCase(sampleString);


        System.out.println("vowelCount : "+vowelCount+" | wordCount : "+wordCount+" | upperCaseCount : "+upperCaseCount);
        countCharFrequency(sampleString);
    }

    private static void countCharFrequency(String sampleString) {
        HashMap<Character,Integer>  frequencyMap = new HashMap<Character, Integer>();
        char ch;
        for(int i=0;i<sampleString.length();i++)
        {
             ch=sampleString.charAt(i);
             if(!frequencyMap.containsKey(ch))
                 frequencyMap.put(ch,1);
             else
                frequencyMap.put(ch,(frequencyMap.get(ch))+ 1);

        }
        System.out.println("Total characterCount : "+frequencyMap.size());

        for(Map.Entry entry:frequencyMap.entrySet())
        {
            System.out.println("character : "+entry.getKey()+" | count : "+entry.getValue());
        }
    }

    private static int countUpperCase(String sampleString) {
        int count=0;
        for (int i=0;i<sampleString.length();i++)
            if(sampleString.charAt(i)>='A' && sampleString.charAt(i)<='Z')
                count++;

            return count;
    }

    private static int countWords(String sampleString) {
        String[] str = sampleString.split(" ");
        return(str.length);

    }

    private static int countVowel(String sampleString) {
        char ch;
        int count=0;
        for(int i=0;i<sampleString.length();i++)
        {
            ch=sampleString.charAt(i);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
                count++;
        }
            return count;

    }
}
