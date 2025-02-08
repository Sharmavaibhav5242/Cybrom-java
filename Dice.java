import java.util.Scanner;
public class Dice {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int favourable=0;
        int total=36;
        for(int i=1;i<=6;++i)
        {
            for (int j=1;j<=6;++j)
            {

                if((i*j)==16)
                {
                    favourable++;
                }
            }
        }
        System.out.println("The probablity of getting 16 is"+" "+(double)favourable/total);
    }
}
