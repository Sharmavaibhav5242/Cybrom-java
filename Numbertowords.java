import java.util.Scanner;
public class Numbertowords {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num;
        int reminder;
        int reverse=0;
        int count=0;
        System.out.println("Enter number");
        num= obj.nextInt();
        for (int i=1;num>0;++i) {
            reminder = num % 10;
            reverse = (reverse * 10) + reminder;
            count++;
            num = num / 10;
        }
        while(count!=0) {
            reminder = reverse % 10;
            reverse = reverse / 10;
            switch (reminder) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
            count--;
        }



    }
}
