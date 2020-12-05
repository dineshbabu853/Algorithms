import java.util.Stack;

public class balancestring {
    public static void main(String[] args) {
        String str="}}}}{{{}{}{}";
        System.out.println(countReversals(str) );
    }

    private static int countReversals(String str) {
        int len=str.length();
        if(len%2!=0) return -1;
        Stack<Character> stack = new Stack<>();
        //removing balanced part
        // str = "{{{{}}"
        //
        //
        // {
        // {
        //{}
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            if( c=='}' && !stack.empty() ){
                if( stack.peek()=='{' )
                    stack.pop(); //remove
                else
                    stack.push(c);
            }
            else
                stack.push(c);
        }
        int n=0,m=0;
        while ( !stack.empty() ){
            if( stack.peek()=='{' ) n++;
            else m++;
            stack.pop();
        }
        int ans=(m/2)+(n/2);
        return ans;
    }
}
