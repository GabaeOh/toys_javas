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
            MaxMins maxMins = new MaxMins(); // fuction 생성
            System.out.println("첫 번째 숫자를 입력하시오.");
            first = myObj.nextInt(); // 변수 first의 값 입력
            System.out.println("두 번째 숫자를 입력하시오.");
            second = myObj.nextInt(); // 변수 second의 값 입력
            int result = maxMins.Max(first, second); // result 변수 선언 후 변수 result = funtion Max에서 계산
            System.out.println("두 수중 더 큰 값은: "+result);
        }
        catch (Exception e)
        {
            
        }
        // return 0;
    }

    public int Max(int first, int second)
    {
        int result = 0;
        try
        {
            if (first > second)
            {
                result = first;
            }
            else if (first < second)
            {
                result = second;
            }
            else
            {
                result = first;
            }
        }
        catch (Exception e)
        {
            
        }
        return result;
    }
    // return 0;
}
