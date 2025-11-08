import java.util.*;
public class buysellstock {
    public static int profit(int prices[]){
        int min=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            p=Math.max(p,prices[i]-min);
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int re=profit(prices);
        System.out.println(re);
    }
}
