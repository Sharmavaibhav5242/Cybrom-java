import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num;
        int reminder;
        int reverse=0;
        System.out.println("Enter the number");
        num= obj.nextInt();
        for (int i=1;num>0;++i)
        {
            reminder=num%10;
            reverse=(reverse*10)+reminder;
            num=num/10;


        }
        System.out.println("The reversed number is ="+" "+reverse);
    }
}
