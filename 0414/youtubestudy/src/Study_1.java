/* 1번 문제
 x와 y의 값을 바꾸는 클래스를 작성
-----출력 결과-----
x:10, y:20
x:20, y:10
*/


public class Study_1 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int temp=0;

        System.out.printf("x : %d, y : %d\n",x,y);
        temp=x;
        x=y;
        y=temp;
        System.out.printf("x : %d, y : %d\n",x,y);
    }
}
