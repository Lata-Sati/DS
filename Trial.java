package Problem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trial {
    public static void main(String[] args) {
        longSubStr("pranevanaveen");

    }

    public static void longSubStr(String str){
        String longStr1="";
        String longStr="";
        int longestSubStrSize=0;
        char[] arr=str.toCharArray();

        Map<Character, Integer> mapObj= new HashMap<Character,Integer>() ;
         for(int i=0; i<arr.length;i++){
             if(!mapObj.containsKey(arr[i])){
                 mapObj.put(arr[i],i);
                 //longStr1=longStr1+arr[i];
                 //System.out.println("i value is "+i);

             }
             else {
                 //System.out.println("duplicate occured, exiting");
                 i=mapObj.get(arr[i]);
                 mapObj.clear();
                  }

             if(mapObj.size()>longestSubStrSize){
                 longestSubStrSize=mapObj.size();
                 longStr=mapObj.keySet().toString();
             }

         }
        System.out.println("Longest substring with non-repeating character "+longestSubStrSize);
        System.out.println("longest substring is "+longStr);


    }
}
