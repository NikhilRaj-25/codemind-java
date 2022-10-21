import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
		ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            al.add(b);
        }
        int min=Collections.min(al);
        for(int i=0;i<a;i++){
            if(al.get(i)%min==0){
                continue;
            }
            else{
                min--;
                i=0;
            }
        }
        System.out.println(min);
    }
}