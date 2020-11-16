public class floor {
    public static void main(String[] args) {
        int arr[]={0,3,5,6,11,12,24};
        int n=arr.length;
        int x=0; //floor value for this valriable
        int index = floorSearch( arr , 0 , n-1 , x );
        if(index==-1 )
            System.out.println("sorry! Floor value not present");
        else
            System.out.println("Floor value is "+ arr[index] );
    }

    private static int floorSearch(int[] arr, int low, int high, int x) {
        //base condition
        if( low  > high){
            return -1;
        }
        //logic
        //if last element was the floor value
        if( x>=arr[high] ){
            return high;
        }

        int mid = (low + high )/2;

        if(arr[mid]==x ){
            return mid;
        }
        //if x lies between mid-1 and mid
        if( mid>0 &&  arr[mid-1]<=x && arr[mid]>x ){
            return mid-1;
        }

        if(x<arr[mid] )
            return floorSearch(arr , low , mid-1,x ); // left half
        else
            return floorSearch(arr , mid+1 , high , x ); //right half

    }
}
