import java.util.*;
class SmallestInfiniteSet {
    PriorityQueue<Integer> pq=
                       new PriorityQueue<Integer>((a,b) -> b - a);
       public SmallestInfiniteSet() {
          pq=new PriorityQueue<Integer>((a,b) -> b - a);
           pq.add(1);
           //pq.add(2);
       }
       
       public int popSmallest() {
         int val = pq.remove();
           if(pq.isEmpty())
           pq.add(val+1);
           return val;
       }
       
       public void addBack(int num) {
           if(!pq.contains(num))
               pq.add(num);
       }
   
       public static void main(String[] args) {
           SmallestInfiniteSet obj = new SmallestInfiniteSet();
           int param_1 = obj.popSmallest();
           obj.addBack(param_1);
           System.out.println(param_1);
       }
   }
   
   /**
    * Your SmallestInfiniteSet object will be instantiated and called as such:
    * SmallestInfiniteSet obj = new SmallestInfiniteSet();
    * int param_1 = obj.popSmallest();
    * obj.addBack(num);
    */