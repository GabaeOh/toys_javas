package polls;

import java.util.Scanner;

public class PolllnitailArray {
        public int[] sum ( ){
            Scanner scanner = new Scanner(System.in);
        System.out.print("성함을 입력하세요 ");
        String surveyorName = scanner.nextLine();
        System.out.println("성함 : " + surveyorName);

        String[][] polls = {
                { "1.교수는 수업 전 강의 목표를 명확히 제시하였습니까?" },
                { "(1).전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우그렇다" },
                { "2.강의의 내용은 체계적이고 성의 있게 구성되었는가?" },
                { "(1).전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우그렇다" },
                { "3.교수는 강의 내용에 대해 전문적 지식이 있었는가?" },
                { "(1).전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우그렇다" },
                { "4.강의 진행 속도는 적절하였는가?" },
                { "(1).전혀 아니다", "(2)아니다", "(3)그렇다", "(4)매우그렇다" }
        };

        int getpolls = polls.length / 2; 
        int[] answers = new int[getpolls]; // 답변을 입력 받기 위해 인스턴스화 시키기

        for (int first = 0; first < getpolls; first++) {
            System.out.println(polls[first * 2][0]); // 문항만 출력
            for (int second = 0; second < 4; second++) {
                System.out.println(polls[second * 2 + 1][second]); // 보기값 출력
            }
            answers[first] = getAnswer(); // 스캐너를 통해 답변 입력 받기 ?
        }

        // 통계
        System.out.println("-----설문조사 결과-----");
        for (int first = 0; first < getpolls; first++) {
            System.out.println("Q" + (first + 1) + ": " + answers[first]);
        }
        return answers; // 입력 받은 값 던져주기 (sum에....)
        }
        
        // 답변 입력 받는 값
        public int getAnswer() {   // 스캐너를 통해 답변 입력 받기
        System.out.print("답변을 선택하세요: ");
        Scanner myObj = new Scanner(System.in);
        int answers = myObj.nextInt();
        // scanner.close();
         return answers;
    }   
}
