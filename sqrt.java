import java.util.*;
public class sqrt 
{
    public static int mySqrt(int x) 
    { 
        double r = x / 2 ; 
        while (Math.abs(r * r - x) > 0.00001) //checking how close we are to the square root
        {
            r = 0.5 * (r + x / r); //Newton raphson's formula
            //System.out.println(r); (to print r in each iteration)
        }
        return (int) r;
    }
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number which you want to find the square root of:");
        int n = sc.nextInt();
        sc.close();
        System.out.println(mySqrt(n));    
    }
}
