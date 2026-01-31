import java.util.Scanner;
public class ScannerMethods
{
    public static void main(String[] args)
    {
        Scanner se=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=se.nextInt();
        System.out.println(a);

        System.out.println("Enter the float:");
        float b=se.nextFloat();
        System.out.println(b);

        System.out.println("Enter the string:");
        String name = se.next();
        System.out.println(name);

        System.out.println("Enter the Double:");
        double d=se.nextDouble();
        System.out.println(d);

        System.out.println("Enter the short:");
        short e=se.nextShort();
        System.out.println(e);
    }
}