import java.util.*;
public class file{
    public static int dist(int a){
        if(a<0){
            return 0;
        }
        else if(a==0)
        {   
            return 1;
        }
        else{
            return dist(a-1)+dist(a-2)+dist(a-3);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,ans=0;
        a=sc.nextInt();
        ans=dist(a);
        System.out.println(ans);
    }
}