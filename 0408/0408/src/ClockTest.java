public class ClockTest {
    public static class Clock{

        boolean am = true;
        int hour;
        int minute;
        int secound;


        void apRefresh() {
            do{
                if (hour > 12) {
                    am = !am;
                    hour = hour - 12;
                } else if (hour < 1) {
                    am = !am;
                    hour = hour + 12;
                }
            }while(hour>12 || hour<1);
        }

        void hourRefresh() {
            do{
                if (minute>59) {
                    minute = minute - 60;
                    hour++;
                } else if (minute<0) {
                    minute = minute + 60;
                    hour--;
                }
            }while(minute>59 || minute<0);
            apRefresh();
        }

        void minuteRefresh() {
            do{
                if (secound>59) {
                    secound = secound - 60;
                    minute++;
                } else if (secound<0) {
                    secound = secound + 60;
                    minute--;
                }
            }while(secound>59 || secound<0);
            hourRefresh();
        }

        void addHour(int h){
            hour=hour+h;
            apRefresh();
        }

        void subH(int h){
            hour=hour-h;
            apRefresh();
        }

        void addM(int m){
            minute=minute+m;
            hourRefresh();
        }

        void subM(int m){
            minute=minute-m;
            hourRefresh();
        }

        void addS(int s){
            secound=secound+s;
            minuteRefresh();
        }

        void subS(int s){
            secound=secound-s;
            minuteRefresh();
        }

        void whatTime(){
            String ampm = (am)? "AM" : "PM" ;
            System.out.println(ampm+" "+hour+":"+minute+":"+secound);
        }

        void setUpTime(boolean a, int b, int c, int d){
            String ampm = am ? "AM" : "PM";
            hour = b;
            minute = c;
            secound = d;
            minuteRefresh();
            System.out.println(ampm+" "+hour+":"+minute+":"+secound);
        }

    }

    public static void main(String[] args) {
        Clock c1 = new Clock();


        c1.whatTime();
        c1.addHour(6);
        c1.addM(150);
        c1.addS(800);
        c1.addHour(9);
        c1.whatTime();
        c1.setUpTime(true, 8, 300, 400);
        c1.subH(48);
        c1.whatTime();
        c1.subS(80000);
        c1.whatTime();

    }
}
