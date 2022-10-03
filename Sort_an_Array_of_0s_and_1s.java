import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            arr.add(b);
        }
        Collections.sort(arr);
        System.out.println(arr.toString().replace("[","").replace("]","").replace(",",""));
        
    }
}