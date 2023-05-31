package polls;

import java.util.Scanner;

public class PolllnitailArray {

    public static void main(String[] args) {
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
        int totalQuestions = polls.length / 2;
        int[] answers = new int[totalQuestions];

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(polls[i * 2][0]); // 문항 출력

            for (int j = 0; j < 4; j++) {
                System.out.println(polls[i * 2 + 1][j]); // 보기 출력
            }

            answers[i] = getAnswerFromUser(scanner, 4); // 답변 입력 받기
        }

        System.out.println("-----설문조사 결과-----");
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Q" + (i + 1) + ": " + answers[i]);
        }

    }

    public static int getAnswerFromUser(Scanner scanner, int optionsCount) {
        int answer;
        do {
            System.out.print("답변을 선택하세요: ");
            answer = scanner.nextInt(); // 답변 입력 받는 코드
            scanner.nextLine(); // 개행 문자 처리
        } while (answer < 1 || answer > optionsCount);

        return answer;
    }

}
