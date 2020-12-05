public class window {
    public static void main(String[] args) {
        int arr[]={ 2,-1,2,-33,-1,3,-5,6,7 };
        int n=arr.length;
        int k=3;
        printFirstNegative(arr , n  , k );
    }

    private static void printFirstNegative(int[] arr, int n, int k) {
        for(int i=0;i<(n-k);i++ ){
            boolean flag=false;
            for(int j=i;j<(i+k);j++ ){
                if(arr[j] < 0  ) {
                    System.out.print(arr[j]+" ");
                    flag=true;  //-ve number for that window
                    break;
                }
            }
            if(flag==false ){
                System.out.println("0");
            }
        }
    }
}
