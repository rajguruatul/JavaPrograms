package basicOperations;

public class Febonacci {


    public static void main(String[] args)
    {
        int prev=0,next=1,fib=0,n=10;

        for(int i=0;i<= n;i++)
        {
            fib=prev+next;
            prev = next;
            next =fib;

            System.out.print(prev+"  |  ");
        }




    }
}
