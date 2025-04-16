/* 4번 문제
 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드를 작성
 boolean d = (); // ()안에 조건을 작성할 것
-----출력 결과-----
        true*/



public class Study_4 {
    public static void main(String[] args) {
        char ch;
        ch = 'G';
        boolean d = (((97<=ch && ch<=122)||(65<=ch && ch <= 90)||(48<=ch && ch<=57)) ? true : false);
        System.out.println(d);
    }
}
