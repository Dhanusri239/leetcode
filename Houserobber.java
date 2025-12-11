import java.util.*;
public class Houserobber {
    public static int f(int a[]){
        int r1=0;
        int r2=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            max=Math.max(r1+a[i],r2);
            r1=r2;
            r2=max;
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int r=f(a);
        System.out.println(r);
    }
}
