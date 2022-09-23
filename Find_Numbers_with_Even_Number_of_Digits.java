import java.util.*;
import java.lang.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int d=0,c=0;
        for(int i=0;i<a;i++){
            if(arr[i]<10){
                continue;
            }
            else{
                d=(int)Math.log10(arr[i])+1;
                if(d%2==0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}