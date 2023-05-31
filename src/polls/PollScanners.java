package polls;

import java.util.Scanner;

public class PollScanners {

    public static void main(String[] args) {
        try {

            Scanner myObj = new Scanner(System.in); // 스캐너를 이용해 값을 입력
            int answer = 0;
            answer = myObj.nextInt();
            System.out.println("답) " + answer);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
