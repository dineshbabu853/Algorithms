public class findRotations {
    public static void main(String[] args) {
        //11,15, 18,1, 2, 6,
        int arr[] = {15, 18, 1, 2, 6, 11};
        System.out.println("Total Rotations are "+countRotation(arr) );
    }

    private static int countRotation(int[] arr) {
       int min=Integer.MAX_VALUE;
       int min_index=-1;
       int len=arr.length;
       for( int i=0;i<len;i++ ){
           if( min > arr[i] ){
               min=arr[i];
               min_index=i;
           }
       }
       return min_index;
    }
}

