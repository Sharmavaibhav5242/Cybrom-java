import java.util.Scanner;
public class Primeno {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num;
        int count=0;
        System.out.println("Enter number");
        num= obj.nextInt();
        for (int i=1;i<=num;++i)
        {
            if (num%i==0)
            {

                count++;
            }

        }
        if (count<=2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}
