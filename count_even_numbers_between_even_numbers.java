import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<a-2;i++){
            if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0){
                c+=1;
            }
        }
        System.out.println(c);
    }
}