import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int ans=0;
        for(int i=0;i<a;i++){
            if(arr[i]>b){
                ans+=2;
            }
            else{
                ans++;
            }
        }
        System.out.println(ans);
    }
}