import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class decimaltoanybase 
{
    public static int getBase(int x, int y)
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

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        int base = sc.nextInt();

        int Answer = getBase(num, base);
        System.out.println(Answer);
    }   
}
