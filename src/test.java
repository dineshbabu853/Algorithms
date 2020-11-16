public class test {
    public static void main(String[] args) {
        int arr[]={1 ,2 ,3 , 3,3,3,4,4};
        System.out.println("count is " + countfrequency(arr ,4 ) );
    }

    private static int countfrequency(int[] arr, int k) {
        int ind = getIndex(arr , 0 ,arr.length-1 , k );
        if(ind==-1){
            return 0;
        }
        int count=1;
        int leftitr=ind-1;
        int rightitr=ind+1;
        while ( leftitr>=0  && arr[leftitr]==k ){
            count++;
            leftitr--;
        }
        while (rightitr<arr.length && arr[rightitr]==k ){
            count++;
            rightitr++;
        }
        return count;
    }

    private static int getIndex(int[] arr, int low, int high, int k) {
        int mid = low + (high-low)/2;
        if(high<low ) return -1;
        if(arr[mid] == k ) return mid;
        else if(arr[mid] < k ){
            low=mid+1;
            return  getIndex(arr , low  , high , k);
        }
        else {
            high=mid;
           return getIndex(arr , low  , high , k);
        }

    }
}
