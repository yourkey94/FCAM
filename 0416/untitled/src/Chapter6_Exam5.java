//인터페이스 Device를 만든다.
//추상 메서드: void turnOn()
//다음 클래스를 작성한다.
// Phone : Device를 구현
//turnOn() 출력: "스마트폰을 켭니다."
//추가 메서드: call() → "전화를 겁니다." 출력
//Laptop : Device를 구현
//turnOn() 출력: "노트북을 부팅합니다."
//추가 메서드: coding() → "코딩 중입니다." 출력
//Fridge : 인터페이스를 구현하지 않음
//메서드: freeze() → "냉동 기능 작동!" 출력
//Object[] devices = { new Phone(), new Laptop(), new Fridge() }
//반복문으로 순회하며 다음 동작을 수행하시오:
//

interface Device{
    void turnOn();
}
class Phone implements Device{

    public void turnOn(){
        System.out.println("스마트폰을 켭니다.");
    }
    String call(){
        return "전화를 겁니다.";
    }
}

class Laptop implements Device{

    public void turnOn(){
        System.out.println("노트북을 부팅합니다.");
    }
    String coding(){
        return "코딩 중입니다.";
    }
}

class Fridge{

    String freeze(){
        return "냉동 기능 작동!";
    }
}

//Device를 구현한 경우 → turnOn() 호출
//Phone이면 call()도 호출
//Laptop이면 coding()도 호출
//Fridge처럼 Device 구현 안 한 경우 → "이 기기는 디바이스가 아닙니다." 출력
public class Chapter6_Exam5 {
    public static void main(String[] args) {
        Object[] devices = {new Phone(), new Laptop(), new Fridge()};
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] instanceof Device) {
                ((Device) devices[i]).turnOn();
                if (devices[i] instanceof Phone)
                    System.out.println(((Phone)devices[i]).call());
                if (devices[i] instanceof Laptop)
                    System.out.println(((Laptop)devices[i]).coding());
            }else System.out.println("이 기기는 디바이스가 아닙니다.");
        }
    }
}
