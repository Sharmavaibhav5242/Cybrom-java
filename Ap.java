import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a;
        int n;
        int d;
        int term=0;
        System.out.println("Enter the first term,number of terms and common difference respectively");
        a= obj.nextInt();
        n= obj.nextInt();
        d= obj.nextInt();
        for (int i=0;i<=n;++i)
        {
            term=a+i*d;
            System.out.println(term);
        }

    }
}
