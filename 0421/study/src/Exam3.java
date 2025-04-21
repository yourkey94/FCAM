//3번 문제
//랜덤한 숫자를 Math.random을 통해 받고
//Scanner를 이용해 정답 맞추기
//-----출력 결과-----
//        1과 100 사이의 정수를 입력하세요 : 50
//더 작은 값으로 다시 시도해보세요.
//1과 100 사이의 정수를 입력하세요 : 25
//더 큰 값으로 다시 시도해보세요.
//1과 100 사이의 정수를 입력하세요 : 5555
//잘못입력하셨습니다. 다시 시도해보세요.
//        1과 100 사이의 정수를 입력하세요 : 21
//정답입니다.
import java.util.*;

public class Exam3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Loop1 : for (;;){
            System.out.println("랜덤 값을 맞춰보세요.");
            int random = (int)(Math.random()*100)+1;
            System.out.println(random);
            for(;;){
                try {
                String textScan = scan.nextLine();
                int ts = Integer.parseInt(textScan);

                    if (ts < random) {
                        System.out.println(ts + "보다 큰 값 입니다.");
                    } else if (ts > random) {
                        System.out.println(ts + "보다 작은 값 입니다.");
                    } else if (ts == random) {
                        System.out.println("정답입니다.");
                        System.out.println("다시 하시겠습니까? Y/N");
                        String yn = scan.nextLine();
//                        scan.nextLine();
                        if (yn.equalsIgnoreCase("Y")) {
                            continue Loop1;
                        } else if (yn.equalsIgnoreCase("N")) {
                            System.out.println("프로그램을 종료합니다");
                            break Loop1;
                        }
                    }
                }catch(NumberFormatException e){
                    System.out.println("잘못된 입력입니다.");
                }
            }
        }

    }
}
