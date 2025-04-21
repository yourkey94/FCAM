//5번 문제
//1~10 까지의 중복되지 않는 숫자를
//Math.random()을 사용하여
//        배열에 저장하고, 출력
//배열을 오름차순으로 정렬하고 출력
//배열을 새로운 배열로 복사하고, 출력
//출력결과
//random:[6, 7, 8, 1, 9, 4, 3, 2, 5, 10]
//numArr:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//Arrcopy:[3, 4, 5, 6]

import java.util.Arrays;

public class Exam5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] random = new int[arr.length];
        int[] numArr = new int[arr.length];
        int[] Arrcopy = new int[4];
        int temp = 0;

        for(int i=0 ; i<arr.length ; i++){
            int randomNum  = (int)(Math.random()*10);
            temp = arr[i];
            arr[i] = arr[randomNum];
            arr[randomNum] = temp;
            random[i]=arr[i];
        }

        for(int i=0 ; i<arr.length ; i++){
            random[i]=arr[i];
        }System.out.println("random : "+Arrays.toString(random));


        Arrays.sort(random);
        for(int i=0 ; i<arr.length ; i++){
            numArr[i]=random[i];
        }
        System.out.println("numArray : "+Arrays.toString(numArr));

        System.arraycopy(numArr,2,Arrcopy,0,4);
        System.out.println("Arraycopy : "+Arrays.toString(Arrcopy));


    }
}
