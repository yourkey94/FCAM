public class Exam6_24 {
    static int abs(int x){
        if(x>=0) return x;
        else return -x;
    }


    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값"+abs(value));
    }
}
