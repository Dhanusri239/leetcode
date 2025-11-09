import java.util.*;
public class productexceptself {
    public static int[] pro(int a[]){
        int re[]=new int[a.length];
        Arrays.fill(re,1);
        int pre=1;
        int pos=1;
        for(int i=0;i<a.length;i++){
             re[i]=pre;
            pre=a[i]*pre;
        }
        for(int i=a.length-1;i>=0;i--){
            re[i]=pos*re[i];
            pos=pos*a[i];
        }
        return re;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int re[]=pro(a);
        System.out.println(Arrays.toString(re));
    }
}
