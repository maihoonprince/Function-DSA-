import java.util.*;

public class anyBaseAddition 
{
    public static int baseAddition(int n1, int n2, int base)
    {
        int rv = 0;
        int p = 1;
        int c = 0;
        while(c > 0 || n1 > 0 || n2 > 0)
        {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int dig = rem1 + rem2 + c;
             c = dig / base;
             dig = dig % base;

             rv += dig * p;
             p = p * 10;

        }
        return rv;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int base = sc.nextInt();

        int answer = baseAddition(n1, n2, base);
        System.out.println(answer); 
    }
    
}
