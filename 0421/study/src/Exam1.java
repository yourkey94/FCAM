import java.util.Scanner;

// 1번 문제
// Scanner를 사용하여 점수를 입력 받기.
// 입력 점수에 따라 학점 나누기
//90점 이상 A학점, 98점 이상이라면 +, 94 이하는 -
//80점 이상 B학점, 88점 이상 '+', 84 이하는 '-'
//70점 이상 C학점, 78점 이상 '+', 74이하는 '-'
//나머지도 동일하게 60이상 D학점, 나머지 F학점


public class Exam1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        for(;;) {
            System.out.print("성적을 입력하세요. ");
            String textScan = scan.nextLine();
            try {
                if (0 <= Integer.parseInt(textScan) && Integer.parseInt(textScan) <= 100) {

                    switch (textScan) {
                        case "100":
                        case "99":
                        case "98":
                            System.out.println("A+");
                            break;

                        case "97":
                        case "96":
                        case "95":
                            System.out.println("A");
                            break;

                        case "94":
                        case "93":
                        case "92":
                        case "91":
                        case "90":
                            System.out.println("A-");
                            break;

                        case "89":
                        case "88":
                            System.out.println("B+");
                            break;

                        case "87":
                        case "86":
                        case "85":
                            System.out.println("B");
                            break;

                        case "84":
                        case "83":
                        case "82":
                        case "81":
                        case "80":
                            System.out.println("B-");
                            break;

                        case "79":
                        case "78":
                            System.out.println("C+");
                            break;

                        case "77":
                        case "76":
                        case "75":
                            System.out.println("C");
                            break;

                        case "74":
                        case "73":
                        case "72":
                        case "71":
                        case "70":
                            System.out.println("C-");
                            break;

                        case "69":
                        case "68":
                            System.out.println("D+");
                            break;

                        case "67":
                        case "66":
                        case "65":
                            System.out.println("D");
                            break;

                        case "64":
                        case "63":
                        case "62":
                        case "61":
                        case "60":
                            System.out.println("D-");
                            break;

                        default:
                            System.out.println("F");
                    }
                }
            }catch(NumberFormatException e1) {
                System.out.println("성적 입력이 아니므로 종료됩니다.");
                break;
            }

        }
    }

}
