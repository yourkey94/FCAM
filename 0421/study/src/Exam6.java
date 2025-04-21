//6번 문제
//다음의 숫자 배열
//        numArr={0,1,0,5,5,7,6,4,8,6,1,3,4,7,1}에
//있는 각 숫자들의 개수를 출력합니다
//        출력결과
//숫자:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//개수:[2, 3, 0, 1, 2, 2, 2, 2, 1, 0]

import java.util.Arrays;

public class Exam6 {
    public static void main(String[] args) {
        int[] numArr = {0,1,0,5,5,7,6,4,8,6,1,3,4,7,1};
        int[] number = {0,1,2,3,4,5,6,7,8,9};// 출력용
        int[] counter = new int[number.length];

        for(int i=0 ; i<numArr.length; i++){
            counter[numArr[i]]++;
        }
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(counter));
    }
}
