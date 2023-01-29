import java.util.*;

public class digitfrequency 
{
    public static int digitFrequency(int x, int y)
    {
        int count = 0;
        while(x > 0)
        {
            int rem = x % 10;
            x = x / 10;

            if( rem == y)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig = sc.nextInt();
        
        int digit = digitFrequency(num, dig);

        System.out.println(digit);
    }
    
}
