import java.util.*;
public class Maxproductsubarr {
    public static int maxproduct(int a[]){
        if(a.length==0)return 0;
        int max=a[0];
        int min=a[0];
        int re=max;
        for(int i=1;i<a.length;i++){
            int cur=a[i];
            int t=Math.max( cur,Math.max(max*cur,min*cur));
            min=Math.min(cur,Math.min(min*cur,max*cur));
            max=t;
            re=Math.max(re,max);
        }
        return re;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=maxproduct(arr);
        System.out.println(m);
        sc.close();
    }
}
