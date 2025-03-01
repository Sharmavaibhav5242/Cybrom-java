//import java.util.Scanner;
//public class Arr{
//
//    public static void main(String []arg){
//
//        Scanner obj=new Scanner (System.in);
//        int arr[]=new int[]{5,4,3,2,1,8,9,};
//        int k=5;
//        for(int i=0; i<k; ++i){
//
//            for(int j=i+1; j<arr.length; ++j){
//                if(arr[i]<arr[j]){
//                    int term=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=term;
//
//
//
//
//                }
//
//
//            }
//
//        }
////for(int i=0; i<arr.length; i++){
//
////if(arr[i]==k){
//
////System.out.println(i);
////}
////}
//
//        System.out.println(arr[k-1]);
//
//
//    }
//}
//Q. print ascending number:

import java.util.Scanner;
public class Arr{

    public static void main(String []arg){

        Scanner obj=new Scanner (System.in);
        int arr[]=new int[]{5,4,3,2,1,8,9};

        for(int i=0; i<arr.length; ++i){

            for(int j=i+1; j<arr.length; ++j){
                if(arr[i]>arr[j]){
                    int term=arr[i];
                    arr[i]=arr[j];
                    arr[j]=term;




                }


            }
            System.out.println(arr[i]);


        }

    }
}
