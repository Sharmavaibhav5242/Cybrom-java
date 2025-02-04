import java.util.Scanner;
public class Fibonachi {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        for (int i=0;i<=10;++i)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }
}
