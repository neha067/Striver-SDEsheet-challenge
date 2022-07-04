import java.util.*;
class Solution {
    public static void main(String[] args) {
        String ans=""; String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";
        Map<Character,Character> s = new HashMap<Character,Character>(); char c; char code='a';
        for(int i=0; i< key.length() && code<='z'; i++){
            //if(code=='z')break;
            c = key.charAt(i);
            if(c==' ')continue;
            if(s.containsKey(c)==false){
                s.put(c,code);
            }
            System.out.println(s.get(c));
            
            //System.out.println(s.);
            code++;
        }
        for(int i=0; i<message.length(); i++){
            c= message.charAt(i);
            if(c==' ')ans+=' ';
            else
            ans+= s.get(c);
        }
        System.out.println(ans);
    }
}