import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int s=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        int c=0;
        for(int i=0;i<a;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}