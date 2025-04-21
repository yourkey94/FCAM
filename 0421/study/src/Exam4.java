//4번 문제
//국어, 영어, 수학, 총점, 평균을
//이름과 함께 번호순으로 출력
//각 과목별 평균점수도 출력-----------------------------
//국어, 영어, 수학의 등수를 배열로 출력
//KIM 1번, 국어 100, 영어 100, 수학 100
//LEE 2번, 국어 20, 영어 20, 수학 20
//PARK 3번, 국어 50, 영어 30, 수학 30
//SONG 4번, 국어 40, 영어 40, 수학 40
//CHOI 5번, 국어 30, 영어 50, 수학 50
//출력결과
//번호  이름  국어  영어  수학  총점  평균
//=============================
//        1   KIM 100 100 100 300 100.0
//        2   LEE 20  20  20  60  20.0
//        3   KOO 50  50  50  150 50.0
//        4   SON 40  40  40  120 40.0
//        5   CHO 30  30  30  90  30.0
//        =============================
//국어: KIM KOO SON CHO LEE
//영어: KIM KOO SON CHO LEE
//수학: KIM KOO SON CHO LEE

import java.util.Arrays;

public class Exam4 {

    //총점 구하기
    static String sum(String a, String b, String c) {
        int sum = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c);
        String sumstr = Integer.toString(sum);
        return sumstr;
    }

    //평균 구하기
    static String aver(String a, String b, String c) {
        int sum = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c);
        float ave = sum / 3.0f;
        String strave = Float.toString(ave);
        return strave;
    }

    static String classaver(String a, String b, String c, String d, String e) {
        int sum = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c) + Integer.parseInt(d) + Integer.parseInt(e);
        float ave = sum / 5.0f;
        String strave = Float.toString(ave);
        return strave;
    }

    //등수
    static void ranking(String[][] arr, String a) {
        String[] rankName = new String[arr.length];
        String[] rankScore = new String[arr.length];

        for (int i = 0; i < arr[0].length; i++) {
            if (arr[0][i] == a) {
                rankName[0] = arr[0][i];
                rankScore[0] = "SCORE";

                for (int j = 1; j < arr.length; j++) {
                    rankName[j] = arr[j][1];
                    rankScore[j] = arr[j][i];
                }

                for (int j = 1; j < rankName.length; j++) {
                    for (int k = 1; k < rankName.length - j; k++) {
                        if (Integer.parseInt(rankScore[j]) < Integer.parseInt(rankScore[j + k])) {
                            String temp = "";
                            temp = rankScore[j];
                            rankScore[j] = rankScore[j + k];
                            rankScore[j + k] = temp;

                            temp = rankName[j];
                            rankName[j] = rankName[j + k];
                            rankName[j + k] = temp;
                        }
                    }
                }

            }
        }
        System.out.println(Arrays.toString(rankName));
//        System.out.println(Arrays.toString(rankScore));

    }

    public static void main(String[] args) {
        String[][] arr = {{"번호", "이름", "국어", "영어", "수학", "총점", "평균"}
                , {"1", "KIM", "100", "100", "100", null, null}
                , {"2", "LEE", "20", "20", "20", null, null}
                , {"3", "KOO", "50", "50", "50", null, null}
                , {"4", "SON", "40", "40", "40", null, null}
                , {"5", "CHO", "30", "30", "30", null, null}};

        for (int i = 1; i < arr.length; i++) {
            arr[i][5] = sum(arr[i][2], arr[i][3], arr[i][4]);
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i][6] = aver(arr[i][2], arr[i][3], arr[i][4]);
        }

        for (int i = 2; i <5 ; i++) {
            String caver = classaver(arr[1][i],arr[2][i],arr[3][i],arr[4][i],arr[5][i]);
            System.out.println((arr[0][i]+"평균 : "+caver));
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.deepToString(arr[i]));
        }
        ranking(arr, "국어");
        ranking(arr, "영어");
        ranking(arr, "수학");
    }
}
