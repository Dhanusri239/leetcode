import java.util.*;
public class combinationsum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        List<List<Integer>> li=f(arr,t);
         System.out.println(li);
    }
    public static List<List<Integer>> f(int a[],int t){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> co=new ArrayList<>();
        backtrack(t,res,co,0,a);
        return res;
    }
    public static void backtrack(int t,List<List<Integer>>res,List<Integer>co,int s,int a[]){
        if(t==0){
            res.add(new ArrayList<>(co));

        }
        else if(t<0){
            return;
        }
        for(int i=s;i<a.length;i++){
            co.add(a[i]);
            backtrack(t-a[i],res,co,i,a);
            co.remove(co.size()-1);
        }
    }
}
