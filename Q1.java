import java.util.*;

public class Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int max=arr[n-1];
        System.out.print(max+"  ");

        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.print(arr[i]+"   ");
            }
        }
    }
}

/*
import java.util.*;

public class Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int max=arr[i];
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(max<=arr[j]){
                    max=arr[j];
                    flag=true;
                }
            }
            if(!flag)
            System.out.print(arr[i]+"  ");
        }
    }
}
*/