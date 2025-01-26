import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num;
        int temp;
        System.out.println("Enter number from 1 to 9");
        num= obj.nextInt();
        if (num>=1 && num<=9)
        {
            System.out.println(num);
            System.out.println("Enter next num");
            temp= obj.nextInt();
            if (temp!=num+1 && temp!=num-1)
            {
                System.out.println(temp);
                System.out.println("Enter next num");
                num= obj.nextInt();
                if (num!=temp+1 && num!=temp-1)
                {
                    System.out.println(num);
                    System.out.println("Enter next num");
                    temp= obj.nextInt();
                    if(temp!=num+1 && temp!=num-1)
                    {
                        System.out.println(temp);
                        System.out.println("Enter next num");
                        num= obj.nextInt();
                        if (num!=temp+1 && num!=temp-1)
                        {
                            System.out.println(num);
                            System.out.println("Enter next num");
                            temp= obj.nextInt();
                            if (temp!=num+1 && temp!=num-1)
                            {
                                System.out.println(temp);
                                System.out.println("Enter next num");
                                num= obj.nextInt();
                                if (num!=temp+1 && num!=temp-1)
                                {
                                    System.out.println(num);
                                    System.out.println("Enter next num");
                                    temp=obj.nextInt();
                                    if (temp!=num+1 && temp!=num-1)
                                    {
                                        System.out.println(temp);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Error");
        }
    }
}

