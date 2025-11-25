import java.util.*;
public class climbingstairs {
    public static int val(int n){
        if(n==1){
            return 1;
        }
        int o=1;
        int t=2;
        for(int i=3;i<=n;i++){
            int tot=o+t;
            o=t;
            t=tot;
        }
        return t;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=val(n);
        System.out.println(r);
    }
}
