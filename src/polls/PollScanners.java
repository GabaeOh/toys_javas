package polls;
import java.util.Scanner;
public class PollScanners {

    public int getAnswer() {
        int answer = 0;
        try {
            
            System.out.print("답)");
            Scanner myObj = new Scanner(System.in); // 스캐너를 이용해 값을 입력
            answer = myObj.nextInt();

            myObj.close();    
            }
            catch (Exception e) {
                // TODO: handle exception
        } return answer;
        }
    }
