import java.util.Scanner;

public class MaxMins {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }

    public int Max(int first, int second) {
        int result = 0;
        try {
            if (first > second) {
                result = first;
            } else if (first < second) {
                result = second;
            } else {
                result = first;
            }
        } catch (Exception e) {

        }
        return result;
    }

    // 두 값을 비교해서 min 값 추출
 public int min(int A, int B){ // 비교하는 두 값 변수화 
    int result = 0;
    try {
        if(A < B){  // A, B를 비교해서 A가 작을 경우 
            result = A; 
        }
        else { // A, B를 비교해서 B가 작을 경우 
            result = B;
        }
    }
        catch (Exception e) {
        // TODO: handle exception
        }
        return  result ;
 }

    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);

            MaxMins maxMins = new MaxMins(); // 인스턴스화

            System.out.println("첫 번째 숫자를 입력하시오.");
            int A = myObj.nextInt(); // 변수 first의 값 입력
            System.out.println("두 번째 숫자를 입력하시오.");
            int B = myObj.nextInt(); // 변수 second의 값 입력

            int returnresult = maxMins.min(A, B);
            int result = maxMins.Max(A, B); // result 변수 선언 후 변수 result = funtion Max에서 계산

            System.out.println("두 수중 더 큰 값은: " + result);
            System.out.println("두 수중 더 작은 값은: " + returnresult); // 최종 값 추출

        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
