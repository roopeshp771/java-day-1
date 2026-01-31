import java.util.Scanner;
public class Vote
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your age:");
        int a=obj.nextInt();
        if(a>=18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not Eligible for vote");
        }
    }
}