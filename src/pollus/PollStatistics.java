package pollus;
// 끝나고 돌아가야 할 값이 없어서 리턴 값없음 그래서 void
public class PollStatistics {
    public int printAnswer(String[] answers){
        try {
            for (int first=0; first < answers.length; first=first+1) {
                System.out.print(answers[first]+", ");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 1; // 성공하면 1, 실패하면 0 (대게)
    }
}
