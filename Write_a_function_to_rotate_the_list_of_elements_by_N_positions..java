import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a;i++){
            int c=sc.nextInt();
            al.add(c);
        }
        int b=sc.nextInt();
        Collections.rotate(al,b);
        System.out.print(al.toString().replace("[","").replace("]","").replace(",",""));
    }
}