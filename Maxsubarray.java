import java.util.*;

public class Maxsubarray {
     public static int maxsub(int arr[]){
        int c=0;
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(c<0){
                c=0;
            }
            c=c+arr[i];
            m=Math.max(c,m);
        }
        return m;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int  m=maxsub(arr);
       System.out.println(m);
    }
}
