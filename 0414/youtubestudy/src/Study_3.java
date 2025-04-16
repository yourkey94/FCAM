/* 3번 문제
실수형 PI를 선언하여 소수점 3째 자리에서 반올림하세요
-----출력 결과-----
        3.142*/

public class Study_3 {
    public static void main(String[] args) {
        double pi = Math.PI;
        pi=(Math.round(pi*1000) / (double)1000);
        System.out.println(pi);
    }

    //%.숫자f > x번째 반올림
}
