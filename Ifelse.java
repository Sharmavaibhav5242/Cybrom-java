import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int path;
        System.out.println("Enter path");
        path=obj.nextInt();
        if (path==1){
            System.out.println("Enter next path");
            path= obj.nextInt();
            if (path==2)
            {
                System.out.println("Enter next path");
                path=obj.nextInt();
                if (path==3){
                    System.out.println("Enter next path");
                    path= obj.nextInt();
                } else if (path==4) {
                    System.out.println("Destination reached");
                }
            } else if (path==3) {
                System.out.println("Enter next path");
                path= obj.nextInt();
              if (path==2){
                  System.out.println("Enter next path");
                  path= obj.nextInt();
              } else if (path==4) {
                  System.out.println("Destination reached");
              }
            } else if (path==4) {
                System.out.println("Destination reached");

            }
        }
        else {
            System.out.println("Wrong path");
        }

    }
}
