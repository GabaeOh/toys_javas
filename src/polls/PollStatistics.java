package polls;


public class PollStatistics {

	public void PollStatistics() {
        try { 
        int answer;
        PolllnitailArray polllnitailArray = new PolllnitailArray();
        String[][] totalQuestions= polllnitailArray.Polls();
        
        int[] answers = {0,0,0,0};
        for (int first = 0; first < totalQuestions.length; first=first+2) {
            System.out.println(totalQuestions[first][0]);
            for (int second = 0; second < 4; second = second+1) {
                System.out.print(totalQuestions[first+1][second]);
            }
            System.out.println();
            
            PollScanners pollScanners = new PollScanners();
            answer = pollScanners.getAnswer();
            if (first == 0) {
                answers[first] = answer;
            } else if (first != 0) {
                answers[first/2] = answer;
            }
        }
        
        System.out.println("----설문통계----");
        System.out.println("----설문종료----");
        System.out.print("답)");
        for (int third =0; third < 4; third = third + 1) {
            System.out.print(" "+ answers[third]);
        }
        
        
           
        

        } catch (Exception e) {
            // TODO: handle exception
        } 

    }

}
