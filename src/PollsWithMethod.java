
import polls.PolllnitailArray;
import polls.PollScanners;
import polls.PollStatistics;

public class PollsWithMethod {
    public static void main(String[] args) {
        try {

            // 설문조사 항목 호출
            PolllnitailArray polllnitailArray = new PolllnitailArray();
            // 스캐너 사용하여 답 받기
            PollScanners pollScanners = new PollScanners();
            // 받은 답항 통계
            PollStatistics pollStatistics = new PollStatistics();
            pollStatistics.PollStatistics();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
