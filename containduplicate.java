import java.util.*;
public class containduplicate {
    public static boolean dupli(int a[]){
        Set<Integer>v=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(v.contains(a[i])){
                return true;
            }
        else{
            v.add(a[i]);
        }
    }
    return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean r=dupli(arr);
        System.out.println(r);
    }
}
