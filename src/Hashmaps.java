public class Hashmaps {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4};
        //if no duplicate the fun will return -1
        int ans = findDuplicate(arr);
        if( ans ==-1 )
            System.out.println("No Duplicates");
        else
            System.out.println("Duplicate element is "+ans);
    }
    //{1,2,3,4,4}
    private static int findDuplicate(int[] arr) {
            int n = arr.length;

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if( arr[i]== arr[j] )
                        return arr[i];
                }
            }


            boolean visited[]=new boolean[n+1];
            for( int value  : arr ){
                if(visited[value] == true ){
                    return value;
                }
                visited[value]=true;
            }
            return -1;
    }
}
