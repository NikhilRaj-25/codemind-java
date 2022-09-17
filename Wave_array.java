import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int b=0;
        for(int i=0;i<a-2;i+=2){
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                b=1;
            }
            else if(arr[i]>arr[i+1] && arr[i+1]<arr[i+2]){
                b=1;
            }
            else{
                b=0;
                break;
            }
        }
        if(b==1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
