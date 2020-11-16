public class minstepscoins {
    public static void main(String[] args) {
        int height[]={ 2,1,2,5,1 };
        int n=height.length;
        System.out.println("Minimum steps is "+ minsteps(height , n ) );
    }

    private static int minsteps(int[] height, int n) {
        return minstepsRecur(height , 0 , n , 0 );
    }

    private static int minstepsRecur(int[] height, int left, int right, int h) {
        //logic
        //base case
        if( left >= right ){
            return 0;
        }
        //to find the index of minimum height stack
        int m=left;
        for(int i=left; i<right; i++){
            if( height[i] < height[m] ){
                m=i;
            }
        }

        // choose minimum from
        // 1) collecting coins vertically ( total right-left)
        // 2) collecting coins using lower horizontal line on left and right segments

        return Math.min( right-left
                , height[m]-h + minstepsRecur( height  , left , m , height[m]  )
                        + minstepsRecur(height , m+1 , right , height[m]  )  );

    }
}
