import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int c=0,s=0;
        for(int i=0;i<a;i++){
            if(arr[i]==1){
                c+=1;
            }
            else{
                if(s<c){
                    s=c;
                }
                c=0;
            }
        }
        if(s<c){
            s=c;
        }
        System.out.println(s);
    }
}