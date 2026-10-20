import java.util.*;
public class Solution{
    public static double fastpower(double a, int n){
        if(n==0)    return 1;
        if(n==1)    return a;
        double smaller =fastpower(a,n/2);
        if(n%2==0){ 
             return smaller*smaller;
        }
        else{
            return smaller *smaller*a;
        }
    }
    public static double myPow(double a, int n){
        if(n>=0)    
            return fastpower(a,n);
        else
            return 1/fastpower(a,n);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        int n =sc.nextInt();
        double res=myPow(a,n);
        System.out.print(res);
    }
}