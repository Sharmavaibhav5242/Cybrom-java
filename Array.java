import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
//        int[] arr=new int[] {1,2,3,4,5};
//        System.out.println(arr[4]);
//
//        String[] brr=new String[5];
//        System.out.println(brr[0]);
//
//        int[] crr;
//        crr=new int[5];
//        System.out.println(crr[4]);
//
//        int[] drr={1,2,3,4,5};
//        System.out.println(drr[2]);
//
//        int[] err = new int[5];
//        for (int i=0;i< err.length;++i)
//        {
//            err[i]= obj.nextInt();
//        }
//        for (int i:err)
//        {
//            System.out.println(i);
//        }
        //sum
        int[] arr=new int[]{1,2,3,2,1};
//        int sum=0;
//        for (int i:arr)
//        {
//            sum=sum+i;
//        }
//        System.out.println(sum);
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            if (arr[start]!=arr[end])
            {
                System.out.println("No");
                return;
            }
            else
            {
                System.out.println("yes");
                return;
            }
        }
       for (int i:arr)
       {
           System.out.println(i);
       }

//java mai initialize nhi hota if k andar cpp mai hota h
    /*  if (start=1)
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }*/

    }
}
