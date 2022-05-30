import java.util.*;

public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int profit=0;
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if((arr[k]-arr[j])>profit){
                    profit=arr[k]-arr[j];
                }
            }
        }
        System.out.println(profit);
    }
}