import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        int[] matchsticks = {3,3,3,3,4}; boolean ans;
        int[] subset = new int[4];
        // for(int i=0; i<4; i++)subset[i]=0;
         if(matchsticks.length<4)ans=false;
         int sum=0;
         for(int var : matchsticks)
             sum+= var;
         if(sum%4!=0)ans=false;
         Arrays.sort(matchsticks);
         ans=dfs(matchsticks,subset,sum/4,0);
         System.out.println(ans);

     }
     public static boolean dfs(int[] matchsticks, int[] subset, int len, int ind){
         if(ind >= matchsticks.length) return (matchsticks[0]==matchsticks[1]) && (matchsticks[2]==matchsticks[3]);
         for(int i =0; i<4; i++){
             if(subset[i]+matchsticks[ind]<= len)
                 subset[i] += matchsticks[ind];
             if(dfs(matchsticks,subset,len,ind+1))return true;
             subset[i] -= matchsticks[ind];
         }
         return false;
     }
 
}
