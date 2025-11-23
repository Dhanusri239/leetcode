import java.util.*;
public class Threesum {
    public static List<List<Integer>> threesum(int a[]){
        Arrays.sort(a);
        List<List<Integer>> re=new ArrayList<>();
        for(int i=0;i<a.length && a[i]<=0;i++){
            if(i==0 || a[i]!=a[i-1]){
                twosum(a,i,re);
            }
        }
     return re;   
}
public static void twosum(int a[],int i,List<List<Integer>> re){
    int l=i+1;
    int r=a.length-1;
    while(l<r){
        int s=a[i]+a[l]+a[r];
        if(s<0){
            l++;
        }
        else if(s>0){
            r--;
        }
        else{
            re.add(Arrays.asList(a[i],a[l++],a[r--]));
            while(l<r && a[l]==a[l-1]){
                ++l;
            }
        }
    }
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    List<List<Integer>> res=threesum(arr);
    for(List<Integer> l:res){
        System.out.println(l);
    }
}
}
