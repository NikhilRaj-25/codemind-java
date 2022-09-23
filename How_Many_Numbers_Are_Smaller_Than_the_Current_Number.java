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
            int c=0;
            for(int j=0;j<a;j++){
                if(arr[i]>arr[j]){
                    c++;
                }
            }
            System.out.print(c+" ");
        }
    }
}