import java.util.*;
public class file{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int c=1,d=1,an=1;
        while(true){
            an=1;
            for(int i=0;i<a;i++){
                if(c==arr[i]){
                    an=0;
                    break;
                }
            }
            if(an==0){
                c+=1;
            }
            else{
                System.out.println(c);
                break;
            }
        }
    }
}