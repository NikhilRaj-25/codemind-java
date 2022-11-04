import java.util.*;
public class file{
    public static boolean isprime(int a){
        if(a<2){
            return false;
        }
        else{
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[20];
        int j=0,c=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                arr[j]=i;
                j++;
            }
        }
        for(int i=0;i<j;i++){
            if(isprime(arr[i])){
                if(isprime(arr[j-i])){
                    c=1;
                    System.out.println(arr[i]+" "+arr[j-i]);
                    break;
                }
            }
        }
        if(c==0){
            System.out.println("-1");
        }
    }
}