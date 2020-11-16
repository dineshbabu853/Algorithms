
public class countfreq {

    //3,3,3,5,6,6,7
    // finding the index of x=3
    // count=0
    //
    public static void main(String[] args) {
        int arr[]={ 2,3,3,3,3,4,5,6,6,7 };
        int x=3;
        int freq=freqCount(arr , x );
        System.out.println( "count is "+freq);
        System.out.println("Sum is "+ x*freq );
    }

    private static int freqCount(int[] arr, int x) {
        int len = arr.length;
        int ind = findIndex( arr , 0 , len-1 , x );
        //logic
        if(ind==-1){
            return 0;
        }
        int count=1;
        int leftitr=ind-1;
        int rightitr=ind+1;
        while ( leftitr>=0 && arr[leftitr]==x ){
            count++;
            leftitr--;
        }
        while ( rightitr<len && arr[rightitr]==x ){
            count++;
            rightitr++;
        }
        return count;
    }

    private static int findIndex(int[] arr, int low, int high, int x) {
        //binary search // logn
        if( high < low )
            return -1;
        int mid = low  + (high-low)/2;
        if( arr[mid]==x )
            return mid;
        else if( arr[mid] > x  ){
            return findIndex( arr , low , mid-1 , x );
        }
        else {
            return findIndex(arr , mid+1,high  ,x );
        }
    }

}
