import java.util.*;
class twosum{
    public static int[] Twosum(int []n,int t){
       Map<Integer,Integer>m=new HashMap<>();
       for(int i=0;i<n.length;i++){
        int d=t-n[i];
        if(m.containsKey(d)){
            return new int[]{m.get(d),i};
        }
        m.put(n[i],i);
       }
       return null;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int r[]=Twosum(num,target);
        System.out.println(Arrays.toString(r));
    }
}