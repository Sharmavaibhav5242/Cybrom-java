import java.util.Scanner;
public class paints
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
        String s1;
        String s2;
        String s3;
        System.out.println("Enter colours to be mixed");
        s1=obj.nextLine();
        s2=obj.nextLine();
        s3=s1+s2;
        if(s1!=s2)
        {
            System.out.println(s3);
        }
        
    }
}


//import java.util.Scanner;
//public class
//{
//    public static void main(String []args)
//    {
//        Scanner obj=new Scanner(System.in);
//        String s1="red";
//        String s2="Black";
//        String s3;
//        System.out.println("Enter colours to be mixed");
//        // s1=obj.nextLine();
//        // s2=obj.nextLine();
//        s3=s1+s2;
//        if(s3.equals("redBlack"))
//        {
//            System.out.println(s3);
//        }
//        else
//        {
//            System.out.println("WI");
//        }
//
//    }
//}