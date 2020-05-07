package basicOperations;

public class Armstrong {

    public static void main(String[] args )
    {
        int num = 152,sum=0,digit=0,temp,power;
        temp=num;
        power=(int)Math.floor(Math.log10(num)+1);

        while(num>0)
        {
            digit=num%10;
            sum=sum + (int)Math.pow(digit,power);
            num=num/10;
        }

        if(sum==temp)
            System.out.println("armstrong");
        else
            System.out.println("not an armsstrong");
    }
}
