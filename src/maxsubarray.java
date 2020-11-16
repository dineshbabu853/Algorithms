public class maxsubarray {
    public static void main(String[] args) {
        int[] arr = { -2, -5, 6, -2, -3, 1, 5, -6};
        System.out.println("maximum sum is "+ maximumsum( arr , 0 , arr.length-1 ) );
    }

    private static int maximumsum(int[] arr, int left, int right) {
        if(right == left ){  // one element is present
            return arr[left];
        }
        int mid = (left+right)/2;
        int leftMax = Integer.MIN_VALUE;
        int sum=0;
        for( int i=mid; i>=left; i-- ){
            sum+=arr[i];
            if(sum > leftMax ){
                leftMax=sum;
            }
        }
        int rightMax = Integer.MIN_VALUE;
        sum=0;
        for( int i=mid+1; i<=right; i++ ){
            sum+=arr[i];
            if(sum > rightMax ){
                rightMax=sum;
            }
        }
              //max                                      // lefthalf              //righthalf
        int maxleftright = Integer.max( maximumsum( arr , left , mid )  , maximumsum(arr , mid+1,right ) );
                                                //overlappingsum
        return Integer.max( maxleftright  , leftMax+rightMax );
    }
}

// arr[] =  { 2 , 1 , 2 , 5 , 1 }