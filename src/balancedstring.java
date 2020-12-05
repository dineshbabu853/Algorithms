import java.util.Scanner;

public class balancedstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(); //RL RRLL RL RL
        int len=s.length();
        int countOfL=0,countOfR=0;
        int ans=0;
        for(int i=0;i<len;i++){
            if( s.charAt(i)=='L' )
                countOfL++;
            else
                countOfR++;
            //logic
            if( countOfL == countOfR ){
                ans++;
                countOfL=0; //reset
                countOfR=0;
            }
        }
        System.out.println("Max count of strings is "+ans);
    }
}
