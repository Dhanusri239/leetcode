import java.util.*;
public class minrotatedsortarr {
    public static int min(int a[]){
        int l=0;
        int r=a.length-1;
        while(l<r){
            int mid= l + (r-l) / 2;
            if(a[mid]>a[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }

        return a[l];

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=min(arr);
        System.out.println(m);
       
    }
    
}
