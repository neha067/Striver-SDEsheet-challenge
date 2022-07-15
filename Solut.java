import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        int mincost =0,j=0,size=cost.length;
//         // if(size<4){
//         //     if(size==3)return cost[1];
//         // }
//         // if(cost[0]<cost[1]) i =0; 
//         // else  i= 1; 
//         // mincost = cost[i];
//         i = cost.length-1;
//         while(i >=0{
//             if(cost[i-1]<=cost[i-2]){
//                 mincost += cost[i+1];
//                 i++;
                
//             }else{
//                 mincost += cost[i+2];
//                 i=i+2;
//             }
//         } guu
        
        int[] dp = new int[size];
         PriorityQueue<Pair<Integer,Integer> > pq=
                    new PriorityQueue<Pair<Integer,Integer>>(size,(a,b) -> a.getKey() - b.getKey());
            //for dp[ind],ind
        dp[size-1] = cost[size-1]; //coz cost for last stop is itself
        
        pq.add(new Pair(dp[size-1],size-1));
        
        for(int i=size-2; i>=0; i--){
            while(pq.size()!=0 && pq.peek().getValue() > i+2) pq.remove();
            
            dp[i] = pq.peek().getKey() + cost[i];
            
            pq.add(new Pair(dp[i],i));
        }
        
        System.out.print(dp[0]);
    }
}
