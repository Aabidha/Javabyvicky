import java.util.Scanner;

public class OddEven
{
   
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);

        System.out.println("Enter a value");
        int i=a.nextInt();

        if(i%2==0)
        System.out.println("Even");
        else 
        System.out.println("Odd");
    }
}