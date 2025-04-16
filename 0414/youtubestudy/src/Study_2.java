/* 2번 문제
 Scanner를 입력받아 나이와 이름을 출력하기
 나이를 입력하세요 : 26
 이름을 입력하세요 : 이상수
-----출력 결과-----
나이 : 26
이름 : 이상수*/

import java.util.*;

public class Study_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String age;
        String name;


        System.out.print("나이를 입력하세요 : ");
        int age1 = s.nextInt();
        //s.nextLine();// 선입력된 엔터가 남아있기 때문에 하나 써줘야함

        System.out.print("나이를 입력하세요 : ");
        String text1 = s.nextLine();
        age=text1;
        System.out.print("이름을 입력하세요 : ");
        String text2 = s.nextLine();
        name=text2;

        System.out.printf("나이 : %s%n",age);
        System.out.printf("이름 : %s%n",name);

    }

}
