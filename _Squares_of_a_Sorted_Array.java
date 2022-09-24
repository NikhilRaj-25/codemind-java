import java.util.*;
import java.lang.*;
public class file{
    public static void main(String[] args){
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double arr[]=new double[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr[i]=Math.pow(arr[i],2);
        }
        double temp;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.printf("%.0f",arr[i]);
            System.out.print(" ");
        }
    }
}