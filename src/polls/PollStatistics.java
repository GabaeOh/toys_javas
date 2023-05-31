package polls;

public class PollStatistics {
    public int[] initialPollStatistics () {
        int[] answers = new int[4]; 
        return answers;
    }

    public static void main(String[] args) {
        try {
            String name = "";
            PollStatistics pollStatistics= new PollStatistics();
            int[] answers = pollStatistics.initialPollStatistics();
            System.out.print("이름 :"+ name);
            for (int first=0; first < answers.length; first=first+1) {
                System.out.print(answers[first]+", ");
            }
            System.out.println();
            // return 0;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
