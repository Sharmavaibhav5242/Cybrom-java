import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String ask;
        System.out.println("What is your query Ask eva");
        ask=obj.nextLine();
        if (ask.equals("Ask eva"))
        {
            System.out.println("What is your query");
            System.out.println("Product or Service");
            ask= obj.nextLine();
            if (ask.equals("Product"))
            {
                System.out.println("1.Car 2.Mobile 3.Home");
                ask=obj.nextLine();
                if(ask.equals("Car"))
                {
                    System.out.println("EMI=1200/month");
                } else if (ask.equals("Mobile")) {
                    System.out.println("EMI=500/month");

                } else if (ask.equals("Home")) {
                    System.out.println("EMI=6000/month");
                }
            } else if (ask.equals("Service")) {
                System.out.println("No-service available");
            }

        }
    }
}
