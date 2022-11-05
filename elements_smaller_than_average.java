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
        int avg=(int) s/a;
        int c=0;
        for(int i=0;i<a;i++){
            if(arr[i]<=avg){
                c+=1;
            }
        }
        System.out.print(c);
    }
}