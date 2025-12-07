import java.util.*;
class lis{
    public static int li(int n[]){
        int l[]=new int[n.length];
        Arrays.fill(l,1);
        int max=1;
        for(int i=1;i<n.length;i++){
            for(int j=0;j<i;j++){
                if(n[i]>n[j]){
                    l[i]=Math.max(l[i],1+l[j]);
                    max=Math.max(l[i],max);
                }
            }
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=li(a);
    
    System.out.println("The longest increasing subsequence is "+r);
    }
}