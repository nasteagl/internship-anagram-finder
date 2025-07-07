package org.anagrams;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String filePath = args.length > 0 ? args[0] : "src/sample.txt";
        AnagramsChecker checker = new AnagramsChecker();
   try{
       Map<String , List<String>>groupOfAnagrams= checker.groupAnagrams(filePath);
       for(List <String> anagrams: groupOfAnagrams.values()){
           System.out.println(String.join(" ", anagrams));
       }
   }catch (Exception e){
       System.err.println("Appear error:"+e.getLocalizedMessage());
   }
        
    }
}



