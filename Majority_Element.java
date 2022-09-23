import java.util.*;
public class file{
    public static void main(String[] args){
        int a,b,count,d=0,i,j,maxCount=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int arr[]=new int[a];
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<a;i++){
            count=1;
            for(j=i+1;j<a;j++){
                if(arr[j]==arr[i]){
                    count++;
                    if(count>maxCount){
                        maxCount=count;
                        d = arr[j];
                    }
                }
            }
        }
        System.out.println(d);
    }
}