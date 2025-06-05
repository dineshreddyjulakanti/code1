import java.util.*;
public class one{
    public static int find(int a[],int i,int prev,int dp[][]){
        if(i>=a.length){
            return 0;
        }
        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
        int nd=find(a,i+1,prev,dp);
        int d=0;
        if(prev==-1 || a[prev]<a[i]){
            d=1+find(a, i+1, i,dp);
        }
        return dp[i][prev+1]=Math.max(nd, d);
        
    }
    public static void main(String args[]){
        int a[]={7,7,7,7,7,7,7};
        int dp[][]=new int[a.length][a.length+1];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length+1;j++){
                dp[i][j]=-1;
            }
        }
        int x=find(a,0,-1,dp);
        // return find(a,0,-1);
        System.out.println(x);
    }
}