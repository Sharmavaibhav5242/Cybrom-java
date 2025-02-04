import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int lcm=0;
        int num2;
        int num1;
        System.out.println("Enter two number whose lcm is to be found out");
        num2=obj.nextInt();
        num1 = obj.nextInt();
        for (int i=num2; ;i=i+num2)
        {
            if (num2%i==0 && num1 %i==0) {
                lcm = i;
                break;
            }
        }
        System.out.println("The lcm of the numbers is ="+" "+lcm);
    }
}
