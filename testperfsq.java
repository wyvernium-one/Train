import java.util.*;
class testpersq 
{
    public static boolean isPerfectSquare(int num) 
    {
        if(num<2)
        return true;

        long l = 2;
        long r = num/2;
        //Binary search
        while(l<=r)
        {
           long m = (l + (r-l)) / 2;
           long guess = m * m;
           if( m > guess)
           r = m - 1;
           else if( m < guess)
           l = m + 1;
           else
           return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number to check if it is a perfect square :");
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPerfectSquare(n));
        
    }
}
