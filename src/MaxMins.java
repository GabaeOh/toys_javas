import java.util.Scanner;
public class MaxMins {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
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
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);  
            int A = myObj.nextInt();
            int B = myObj.nextInt();
            
            MaxMins maxMins= new MaxMins(); //인스턴스화 
            int returnresult = maxMins.min(A,B); 
            System.out.println(returnresult); // 최종 값 추출
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
    }
}
