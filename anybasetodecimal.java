import java.util.*;

public class anybasetodecimal 
{
    public static int baseToDecimal(int num, int base)
    {
        int Answer = 0;
        int power =1;
        while(num > 0)
        {
            int rem = num % 10;
            num = num / 10;
            Answer += rem * power;
            power =  power * base;
        }
        return Answer;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        int Answer = baseToDecimal(num, base);
        System.out.println(Answer);
    }
    
}
