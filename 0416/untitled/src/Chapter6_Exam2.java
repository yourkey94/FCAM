//인터페이스 Playable을 만든다.
//추상 메서드: void play()

//인터페이스 Recordable을 만든다.
//추상 메서드: void record()
//
//MP3Player 클래스는 Playable, Recordable을 모두 구현한다.
//play()를 오버라이딩하여 "음악 재생 중..." 출력
//record()를 오버라이딩하여 "녹음 중..." 출력
//
//Playable과 Recordable 타입으로 각각 MP3Player 객체를 받아서
//다형성으로 play(), record()를 호출해볼 것.
//
//💡 출력 예시
//음악 재생 중...
//녹음 중...
interface Playable{
    void play();
}

interface Recordable{
    void record();
}

class MP3Player implements Playable, Recordable{

    MP3Player(){}

    public void play(){
        System.out.println("음악 재생 중...");
    }
    public void record(){
        System.out.println("녹음 중..." );
    }
}

public class Chapter6_Exam2 {
    public static void main(String[] args) {
        Playable ex1 = new MP3Player();
        Recordable ex2 = new MP3Player();

        ex1.play();
        ex2.record();
    }
}
