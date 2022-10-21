import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        for(int j=0;j<b;j++){
            max=0;
            for(int i=0;i<a;i++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
            System.out.println(max);
        }
    }
}