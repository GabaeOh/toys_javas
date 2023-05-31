import java.util.Scanner;

public class MaxMins
{
    public static void main(String[] args)
    {
        try
        {
            Scanner myObj = new Scanner(System.in);
            int first = 0;
            int second = 0;
            MaxMins maxMins = new MaxMins();
            System.out.println("첫 번째 숫자를 입력하시오.");
            first = myObj.nextInt();
            System.out.println("두 번째 숫자를 입력하시오.");
            second = myObj.nextInt();
            int result = maxMins.Max(first, second);
            System.out.println("두 수의 합은: "+result);
        }
        catch (Exception e)
        {
            
        }
    }

    public int Max(int first, int second)
    {
        int result = 0;
        try
        {
            result = first + second;
        }
        catch (Exception e)
        {
            
        }
        return result;
    }
    // return 0;
}
