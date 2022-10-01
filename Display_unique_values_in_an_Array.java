import java.util.*;
public class file{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int c=0,d=0;
        for(int i=0;i<a;i++){
            c=0;
            for(int j=0;j<a;j++){
                if(arr[i]==arr[j] && i!=j){
                    c=1;
                }
            }
            if(c==0){
                d=1;
                System.out.print(arr[i]+" ");
            }
        }
        if(d==0){
            System.out.println("-1");
        }
    }
}