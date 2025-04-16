//다음 조건을 만족하는 클래스 구조를 작성하시오.
//조상 클래스 Employee
//멤버 변수: name(String), salary(int)
//메서드: getInfo() → 이름과 급여 출력
//자손 클래스 Manager, Engineer
//Manager는 bonus(int) 필드를 추가하고
//getInfo()를 오버라이딩하여 보너스 포함된 출력
//Engineer는 skill(String) 필드를 추가하고
//getInfo()를 오버라이딩하여 기술을 포함한 출력
//**main()**에서 Employee 배열로 Manager, Engineer 객체를 넣고
//다형성으로 반복문을 통해 getInfo()를 호출할 것

class Employee{
    String name;
    int salary;

    void getInfo(){
        System.out.println("이름 : "+name+" 급여 : "+salary);
    }
}

class Manager extends Employee{
    int bouns;

    Manager(){
        this(100);
    }
    Manager(int bouns){
        this("yul", 100);
        this.bouns = bouns;
    }
    Manager(String name, int salary){
        super();
        super.name=name;
        super.salary=salary;
    }
    void getInfo(){
        System.out.println("이름 : "+name+" 급여 : "+salary+" 보너스 : "+bouns);
    }
}

class Engineer extends Employee{
    String skill;

    Engineer(){
        this("deep sleep");
    }
    Engineer(String skill){
        this("ki", 50);
        this.skill = skill;
    }
    Engineer(String name, int salary){
        super();
        super.name=name;
        super.salary=salary;
    }
    void getInfo(){
        System.out.println("이름 : "+name+" 급여 : "+salary+" 기술 : "+skill);
    }
}

public class Chpater6_Exam3 {
    public static void main(String[] args) {
        Employee[] people={new Manager(), new Engineer()};
        for(int i=0 ; i<people.length ; i++){
            people[i].getInfo();
        }
    }
}
