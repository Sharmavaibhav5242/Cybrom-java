import java.util.Scanner;
public class swtich {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String a;
        System.out.println("Enter value");
        a= obj.nextLine();
        String result;
//        java mai switch case mai 3 input leta h which is int,char and string which make it different from other languages
        result=switch (a)
        {
            case "one"->("Case 1");

            case "two"->("Case 2");
//            -> this is arrow operator ye break aur system.out.println hata deta h
            default->("Error");
        };
        System.out.println(result);

    }
}
