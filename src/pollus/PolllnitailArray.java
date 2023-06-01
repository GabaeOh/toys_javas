package pollus;

public class PolllnitailArray {
    // 인스턴스화 데이터 타입은 string[][], 변수명 init, 파라미터값은 안넘어가니깐 ()
    public String[][] init() {
        String[][] polls = {
            {"1. 문항"}, 
            {"(1) 답항", "(2) 답항", "(3) 답항"},
            {"2. 문항"},
            {"(1) 답항", "(2) 답항", "(3) 답항"},
        };
        return polls;
    }
}
