import java.util.*;
import java.lang.*;
public class file{
    public static boolean prime(int a){
        if(a<2){
            return false;
        }
        else{
            for(int i=2;i<=(Math.sqrt(a));i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int min=9999,max=-9999,m1=0,m2=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min){
                min=arr[i];
                m1=i;
            }
            else if(max<arr[i]){
                max=arr[i];
                m2=i;
            }
        }
        int c=0,d=0;
        for(int i=m1;i<=m2;i++){
            d=1;
            if(prime(arr[i])){
                c++;
            }
        }
        if(d==0){
            for(int i=m2;i<=m1;i++){
                if(prime(arr[i])){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}