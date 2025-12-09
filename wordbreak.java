import java.util.*;
class wordbreak{
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=sc.nextInt();
    sc.nextLine();
    String words[]=new String[n];
    for(int i=0;i<n;i++){
        words[i]=sc.nextLine();
    }
    boolean re=f(s,words);
    System.out.println(re);
}
public static boolean f(String s,String words[]){
    boolean dp[]=new boolean[s.length()+1];
    dp[0]=true;
    Set<String> ws=new HashSet<>(Arrays.asList(words));
    for(int i=1;i<=s.length();i++){
        for(int j=0;j<i;j++){
            if(dp[j] && ws.contains(s.substring(j,i))){
                dp[i]=true;
                break;
            }
        }
    }
    return dp[s.length()];
}
}