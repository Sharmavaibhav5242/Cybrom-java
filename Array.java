import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[] arr=new int[] {1,2,3,4,5};
        System.out.println(arr[4]);

        String[] brr=new String[5];
        System.out.println(brr[0]);

        int[] crr;
        crr=new int[5];
        System.out.println(crr[4]);

        int[] drr={1,2,3,4,5};
        System.out.println(drr[2]);
        
        int[] err = new int[5];
        for (int i=0;i< err.length;++i)
        {
            err[i]= obj.nextInt();
        }
        for (int i:err)
        {
            System.out.println(i);
        }

    }
}
