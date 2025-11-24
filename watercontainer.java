import java.util.*;
public class watercontainer {
    public static int max(int a[]){
        int m=0;
        int l=0;
        int r=a.length-1;
        while(l<r){
            int w=r-l;
            int area=Math.min(a[l],a[r])*w;
            m=Math.max(m,area);
            if(a[l]<=a[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=max(a);
        System.out.println(r);
    }
}
