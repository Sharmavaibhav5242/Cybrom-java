import java.util.Scanner;
public class Gp {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a;
        double r;
        double n;
        int term=0;
        System.out.println("Enter first term,number of terms and common ratio for Gp series");
        a=obj.nextInt();
        n= obj.nextInt();
        r= obj.nextInt();

        for (int i=0;i<=n;++i)
        {
            term=(int) (a*(Math.pow(r,i)));
            System.out.println(term);
        }
    }
}
