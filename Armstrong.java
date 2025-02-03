import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num;
        int temp;
        int r;
        int  ans=0;
        System.out.println("Enter number");
        num= obj.nextInt();
        temp=num;
        for (int i=1;num>0;++i)
        {
            r=num%10;
            ans=ans+(r*r*r);
            num=num/10;
        }
        if (temp==ans)
        {
            System.out.println("The number is armstrong");
        }
        else
        {
            System.out.println("The number is not an armstrong");
        }
    }
}
