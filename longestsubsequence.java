import java.util.*;
class longestsubsequence{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int re=f(s1,s2);
        System.out.println("The length of longest subsequence is "+re);
    }
    public static int f(String s1,String s2){
        int m[][]=new int[s1.length()+1][s2.length()+1];
        for(int j=s2.length()-1;j>=0;j--){
            for(int i=s1.length()-1;i>=0;i--){
                if(s1.charAt(i)==s2.charAt(j)){
                    m[i][j]=1+m[i+1][j+1];
                }
                else{
                    m[i][j]=Math.max(m[i][j+1],m[i+1][j]);
                }
            }
        }
        return m[0][0];
        
    }
}