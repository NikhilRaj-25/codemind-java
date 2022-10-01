import java.util.*;
public class file{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int pro=1,b=0;
        while(true){
            pro=1;
            if(b<a){
                for(int i=0;i<a;i++){
                    if(b!=i){
                        pro*=arr[i];
                    }
                }
                System.out.print(pro+" ");
                b++;
            }
            else{
                break;
            }
        }
    }
}