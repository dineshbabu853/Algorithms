import java.util.HashMap;
import java.util.Map;


public class AnagramHashMap {
    public static void main(String[] args) {
        String X = "ccatt";
        String Y = "acctt";
        if( isAnagram(X,Y) ){
            System.out.println("Its an anagram");
        }
        else {
            System.out.println("Its not an anagram");
        }
       // boolean ans = issubSetUtil(arr1 , arr2);
    }

    private static boolean isAnagram(String x, String y) {
        if( x.length()!=y.length() )
            return false;
        Map<Character , Integer > freqMap = new HashMap<>();

        for(char c  :x.toCharArray() ){
            freqMap.put(c , freqMap.getOrDefault(c , 0)+1 );
        }

        for( char c : y.toCharArray() ){
            if(freqMap.containsKey(c) == false ){
                return  false;
            }
            freqMap.put(c  , freqMap.get(c)-1 ); // decrementing freq for every matching word
            if(freqMap.get(c)==0 ){
                freqMap.remove(c);
            }
        }
        return  freqMap.isEmpty();

    }

    public  static  boolean issubSetUtil(int arr1[] , int arr2[]){

        Map<Integer , Integer > map = new HashMap<>();
        for(int i=0;i<arr1.length;i++)
            map.put(arr1[i] , 1 );

        for(int i=0;i<arr2.length;i++){

            if(map.containsKey(arr2[i]) == false ) return false;
        }

        return true;

    }
}


// arr[] = {  1 2 3 -1 -2 -3 5 -2 }


