import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            int c=1;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    c=0;
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(c==1){
                System.out.print("-1 ");
            }
        }
    }
}