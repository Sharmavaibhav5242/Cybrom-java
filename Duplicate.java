import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {

                Scanner obj=new Scanner (System.in);
//                int arr[]=new int[]{1,2,1,2,3,3,111,2};
//
//                for(int i=0; i<arr.length; ++i){
//                    int count=1;
//                    boolean dup=false;
//
//
//                    for(int j=i+1; j<arr.length; j++)
//                    {
//
//
//                        if(arr[i]==arr[j]){
//                            arr[j]=-1;
//                            dup=true;
//                            count++;
//                        }
//
//                    }
//
//                    if(dup && arr[i]!=-1 ){
//                        System.out.println(count);
//                    }
//                    else if(arr[i]!=-1){
//                        System.out.println(count);
//
//
//
//                    }
//                }

//                int arr[]=new int[]{1,2,1,2,3,3,111,2};
//                int min=0;
//
//                for(int i=0; i<arr.length-1; ++i){
//
//                    if(arr[i]<min){
//                        min=arr[i];
//                    }
//                }
//                for(int i=0; i<arr.length-1; ++i){
//                    boolean dup=false;
//
//
//                    for(int j=i+1; j<arr.length; j++)
//                    {
//
//
//                        if(arr[i]==arr[j]){
//                            arr[j]=min-1;
//                            dup=true;        }
//
//                    }
//
//                    if(!dup && arr[i]!=min-1 ){
//                        System.out.println(arr[i]);
//                    }}


                int arr[]=new int[]{1,2,1,2,3,3,111,2};
                int min=0;

                for(int i=0; i<arr.length-1; ++i){

                    if(arr[i]<min){
                        min=arr[i];
                    }
                }
                for(int i=0; i<arr.length-1; ++i){
                    boolean dup=false;


                    for(int j=i+1; j<arr.length; j++)
                    {


                        if(arr[i]==arr[j]){
                            arr[j]=min-1;
                            dup=true;        }

                    }

                    if(dup && arr[i]!=min-1 ){
                        System.out.println(arr[i]);
                    }}

            }
        }




