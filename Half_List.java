import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int i=0;
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int x=a;
        for(x=a;x>a/2;x--){
            System.out.printf(arr[x-1]+" ");
        }
        for(i=0;i<a/2;i++){
            System.out.printf(arr[i]+" ");
            
        }
    }
}