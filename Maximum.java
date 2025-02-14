import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[] arr=new int[]{1,5,8,16,6};

        int max=arr[0];
        for (int i=0;i< arr.length;++i)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
