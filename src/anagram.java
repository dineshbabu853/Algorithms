import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string a");
        String a=sc.next();
        System.out.println("Enter string b");
        String b=sc.next();
        boolean answer= isAnagram(a,b);
        if(answer == true )
            System.out.println("It's an anagram");
        else
            System.out.println("Its not an anagram");
    }

    private static boolean isAnagram(String a, String b) {
        //string into character array
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        //Arrays.sort()
        //own sorting algo
      /*  Arrays.sort(arr1);
        Arrays.sort(arr2);

*/
        sortArray(arr1);
        sortArray(arr2);
        int len=arr1.length;
        for(int i=0;i<len;i++ ){
            if(arr1[i]!=arr2[i] )
                return false;
        }
        return true;
    }

    private static void sortArray(char[] arr) {
        int len=arr.length;
        //selection sort
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if( arr[i] > arr[j] ){
                    char t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
}
