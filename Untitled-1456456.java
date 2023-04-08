import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        long sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int p=0;
        for(int i=0;i<n;i++){
            long s=sum-a[i];
            if(s==a[i]*(n-1)){
                p=1;
                break;
            }
        }
        if(p==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}