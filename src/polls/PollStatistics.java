package polls;
import java.util.Scanner;
public class PollStatistics {
    public int[] initialPollStatistics () {
        int[] answers = new int[4]; 
        return answers;
    }

    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            Scanner myObj1 = new Scanner(System.in);
            Scanner myObj2 = new Scanner(System.in);
            Scanner myObj3 = new Scanner(System.in);

            String name = "";
            PollStatistics pollStatistics= new PollStatistics();
            int[] answers = pollStatistics.initialPollStatistics();
            // System.out.print("이름 :"+ name);
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
