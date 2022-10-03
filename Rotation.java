import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=0;j<a;j++){
                int c=sc.nextInt();
                al.add(c);
            }
            Collections.rotate(al,b);
            System.out.print(al.toString().replace("[","").replace("]","").replace(",",""));
            System.out.println();
        }
    }
}