
import polls.PolllnitailArray;
import polls.PollScanners;
import polls.PollStatistics;

public class PollsWithMethod {
    public static void main(String[] args) {
        try {

            // 설문조사 항목 호출
            PolllnitailArray polllnitailArray = new PolllnitailArray();
            polllnitailArray.sum();
            // 스캐너 사용하여 답항 답기
            PollScanners pollScanners = new PollScanners();
            polllnitailArray.sum();
            // 받은 답항 통계
            PollStatistics pollStatistics = new PollStatistics();
            polllnitailArray.getAnswer(null, 0);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
