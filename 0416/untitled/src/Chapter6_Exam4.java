//다음 조건을 만족하는 Student 클래스를 작성하시오.
//멤버 변수:
//name (String)
//studentNo (int)
//major (String)
//생성자:
//기본 생성자는 "이름없음", 0, "전공없음"으로 초기화
//이름과 학번만 받는 생성자
//모든 값을 받는 생성자
//모든 생성자에서 this()를 사용할 것
//toString()을 오버라이딩하여 다음과 같이 출력되도록 작성
//makefile
//이름: 홍길동, 학번: 2023001, 전공: 전자공학

import java.sql.SQLOutput;

class Student{
    String name;
    int studentNo;
    String major;

    Student() {
        name = "이름없음";
        studentNo = 0;
        major = "전공없음";
    }
    Student(String name, int studentNo) {
        this();
        this.name = name;
        this.studentNo = studentNo;
    }

    Student(String name, int studentNo, String major) {
        this();
        this.name = name;
        this.studentNo = studentNo;
        this.major = major;
    }
    public String toString(){
        System.out.println("makefile");
        return "이름 :"+ name+", 학번 : "+studentNo+", 전공 : "+major;
    }
}

public class Chapter6_Exam4 {
    public static void main(String[] args) {
        Student hong = new Student("홍길동" ,2023001,"전자공학");
        System.out.println(hong.toString());
    }
}
