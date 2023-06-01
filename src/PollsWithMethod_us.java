//refer

import pollus.PolllnitailArray;
import pollus.PollScanners;
import pollus.PollStatistics;

public class PollsWithMethod_us {
    
    public static void main(String[] args) {
        try {
            // polls와 answers의 변수는 main에 두고 사용했으면 됨 
            // = 로 정해진 값들은 파라미터로 넘어가지 않음/파라미터는 변수로 넘어가기 때문 
            //변수 선언 (초기화)
            String[] answers;
            String[][] polls;

            // 설문항 
            PolllnitailArray polllnitailArray= new PolllnitailArray();
            polls = polllnitailArray.init(); // 설문 내용 초기화

            // 답항 받기 
            PollScanners pollScanners= new PollScanners();
            answers = pollScanners.pollwithAnswer(polls); // answer의 답을 받기 때문에 

            // 값 출력(통계)
            PollStatistics pollStatistics= new PollStatistics();
            pollStatistics.printAnswer(answers);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
    }
}
