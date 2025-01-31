import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int sum=0;
        for (int i=0;i<10;++i)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        int j=0;
        while(j<10)
        {
            sum=sum+j;
            ++j;
        }
        System.out.println(sum);
        int l=0;
        do {
            sum=sum+l;
            l++;
        }while (l<10);
        System.out.println(sum);
    }
}
