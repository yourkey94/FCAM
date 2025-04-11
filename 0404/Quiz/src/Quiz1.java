public class Quiz1 {
    public static void main(String[] args){
        System.out.println(mid(9, 4, 5));

    }
    static int mid(int x, int y, int z){

        if(x<=y) {
            if(y<=z){
                return y;
            }else if(x<=z){
                return z;
            }else {
                return x;
            }
        }else {
            if(x<=z){
                return x;
            }else if(y<=z){
                return z;
            }else {
                return y;
            }
        }
    }
}
