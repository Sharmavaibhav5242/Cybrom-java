import java.util.Scanner;
public class Fun{

    void add(int a, char b,String name,int arr[]){

        Scanner ob=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(a+" "+b+" "+name);
        for(int i:arr){
            System.out.println(i);
        }

    }


    public static void main(String []args)
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=obj.nextInt();
        int arr[]=new int[size];
        Fun obje = new Fun();
        obje.add(10,'c',"Vaibhav",arr);
    }


}
