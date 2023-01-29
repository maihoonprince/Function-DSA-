import java.util.*;

public class anybasetoanybase 
{

    public static int decimaltoanybase(int x, int y)
    {
        int Answer = 0;

        int p = 1;
        while(x > 0)
        {
            int rem = x % y;
            x = x / y;

            Answer += rem * p;
            p = p *  10;
        }
        return Answer;

    }

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
        int ansb = sc.nextInt();

        int basedecimal = baseToDecimal(num, base);
        int decimalbase = decimaltoanybase(basedecimal, ansb);
        System.out.println(decimalbase);
    }
    
}
