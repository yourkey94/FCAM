//2단부터 9단까지 구구단 작성하기
//-----출력 결과-----
//        2 x 1 = 2
//        2 x 2 = 4
//        2 x 3 = 6
//        ...(생략)...
//        9 x 8 = 72
//        9 x 9 = 81

public class Exam2 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

}
