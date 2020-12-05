import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class checkSorted {

    static Queue<Integer> queue=new LinkedList<>(); //given queue

    static boolean checkSortedUtil(int size){
        //logic

        Stack<Integer> st=new Stack<>(); //power
        int expected=1;  // smallest of 1st n natural numbers
        int front;

        while (queue.size()!=0 ){
            front=queue.peek(); //poll // taking the front element
            queue.poll();  // remove
            if(front == expected ) //5
                expected++;
            else {
                if( st.size()==0 ){
                    st.push(front);
                }
                else if( st.size()!=0 &&  st.peek() < front  ){
                    return false;
                }
                else
                    st.push(front);
            }

        }
        while (st.size()!=0 && st.peek()==expected ){
            st.pop();
            expected++;
        }

        if(expected-1 == size &&  st.size()==0 ){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        queue.add(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        // 5 , 1 , 2 , 3 , 4, 5

        //
        //
        //
        int p=33;
        System.out.println( Integer.toBinaryString(p) );
        //op:yes
        int n=queue.size();
        if( checkSortedUtil(n) ){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }
}


 //  3 , 2  , 6 , 88  , 9
//   6   6    88   -1   -1

