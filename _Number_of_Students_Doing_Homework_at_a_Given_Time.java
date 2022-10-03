import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int brr[]=new int[b];
        for(int i=0;i<b;i++){
            brr[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int count=0;
        for(int i=0;i<a;i++){
            if((arr[i]<=c) && (brr[i]>=c)){
                count++;
            }
        }
        System.out.println(count);
    }
}