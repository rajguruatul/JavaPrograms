package string.charachterCounting;

public class StringAnagram {


    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        int j=s2.length();
        int i=0;
        boolean flag=true;


        while(i<s1.length())
        {
            if(!(s1.charAt(i) == s2.charAt(j-1)))
            {
                System.out.println("strings are not same");
                flag=false;
                break;
            }
            else
            {
                i++;
                j--;
            }

        }
        if(flag)
            System.out.println("Strings are anagram");


    }

}
