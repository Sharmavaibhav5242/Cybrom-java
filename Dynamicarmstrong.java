import java.util.Scanner;
public class Dynamicarmstrong {
    public static void main(String[] args) {

                Scanner obj=new Scanner(System.in);




                int num=obj.nextInt();
                int number=num;
                int temp=num;
                int n=0;
                int sum=0;
                while(number>0){
                    n++;
                    number=number/10;
                }


                while(temp>0){

                    int rem=temp%10;
                    sum=sum+(int)Math.pow(rem,n);

                    temp=temp/10;
                }
                System.out.println(sum);
                if(sum==num){
                    System.out.println("yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }




