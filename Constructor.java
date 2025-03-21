class Twoo{
    public int arr[];
    public Twoo(int arr[]){
        this.arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];
        }
    }
    public Twoo(Twoo obj){
        this.arr=new int[obj.arr.length];
        for(int i=0;i<obj.arr.length;i++){
            this.arr[i]=obj.arr[i];
        }
    }
    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
public class Constructor {
    public static void main(String []args){
        int []arr={10,20,30};
        Twoo obj=new Twoo(arr);
        Twoo obj1=new Twoo(obj);
        obj.display();
        obj1.display();
        obj.arr[0]=200;
        obj.display();
        obj1.display();
    }
}
