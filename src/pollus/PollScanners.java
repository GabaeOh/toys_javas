package pollus;
import java.util.Scanner;

public class PollScanners {
    // answers가 값이 누적되는 곳이자 밖으로 던져주는 값, 데이터 타입은String[]  / 내부에서 사용하는 값은 polls 
    public String[] pollwithAnswer(String[][] polls){
        try {
            
            String[] answer = {"", ""};
        for (int second=0; second < polls.length; second=second+2){
            int count = 0;
            Scanner myObj = new Scanner(System.in);
            System.out.println(polls[second][0]);
            // 답항 출력 본인이 해 보기

            System.out.print("답하기 : ");
            answers[count] = myObj.nextLine();
            count = count + 1;
            System.out.println();
        }
            myObj.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
        return answers;
    }

    

}
