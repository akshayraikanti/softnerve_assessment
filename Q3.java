import java.util.*;

public class Q3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x=0;
        for(int i=0;i<n;i++){
            x|=arr[i];
        }   
        System.out.println(x*(int)Math.pow(2, n-1));
    }
}

  /*static String xoring(String a,String b,String in){
    int n=Integer.parseInt(in);
    String ans ="";
    for(int i=0;i<n;i++){
        if(a.charAt(i)==b.charAt(i))
            ans+= "0";
        else
            ans+= "1";
    }
    return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String a=Integer.toString(arr[i]);
                String b=Integer.toString(arr[j]);
                String t=Integer.toString(a.length());
                total+=Integer.parseInt(xoring(a,b,t),2);
            }
        }
        System.out.println(total);
    }*/   
    
