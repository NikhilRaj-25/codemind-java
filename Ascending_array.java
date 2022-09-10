import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=1;
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a-1;i++){
            if(arr[i]>=arr[i+1]){
                c=0;
                break;
            }
        }
        if(c==0){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}