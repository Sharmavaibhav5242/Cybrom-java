import java.util.Scanner;
public class Temprature {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double temp;
        System.out.println("Enter temprature");
        temp=obj.nextDouble();
        System.out.println("Convert to 1.farh->celsius 2.celsius->farh");
        int a;
        a= obj.nextInt();
        if (a==1)
        {
            System.out.println((temp*9)/5+3);
        }
        else
        {
            System.out.println((temp*5)/9+32);
        }
    }
}
