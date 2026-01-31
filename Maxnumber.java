import java.util.Scanner;
public class Maxnumber
{
    public static void main(String[] args)
    {
        Scanner og=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=og.nextInt();
        System.out.println("Enter second number:");
        int b=og.nextInt();
        System.out.println("Enter third number:");
        int c=og.nextInt();
        if(a>b && a>c) 
        {
            System.out.println("the maximum number:"+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("The maximum number:"+b);
        }
        else
        {
            System.out.println("The maximum number:"+c);
        }

    }
}