class Data{int x;}

public class TestClass {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x =" + d.x);
/*
        int num =12345;
        int sum = 0;
        for(int i=0 ; i <=4 ; i++){
            sum=(num/(int)1ei)/10;
        }
*/
        int zz= (int)1e1;
       // System.out.println(sum);
        System.out.println(zz);
    }



    static void change(int x){
        x=1000;
        System.out.println("main() : x ="+x);
    }
}
