import java.util.Scanner;

public class validsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++ ){
            arr[i]= sc.next();
        }
        //logic
        for(int i=0;i<n;i++){
            String check = arr[i];
            int flag=0; // valid or not

            for( int j=0;j<n;j++ ){
                if( i!=j && arr[j].contains(check) ){
                    System.out.println(check);
                    break;
                }
            }
        }

    }
}
