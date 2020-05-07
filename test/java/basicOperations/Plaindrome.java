package basicOperations;

public class Plaindrome {
    public static void main(String[] args)
    {
        int num=13341,sum=0,digit=0;
        int temp=num;
        while(num>0)
        {
            digit=num%10;
            sum=(sum*10)+digit;
            num=num/10;
        }

        System.out.println(sum);
        System.out.println(temp);
        if(sum == temp)
            System.out.println("number is palindrome");
        else
            System.out.println(" number is not palindrome");
    }

}
