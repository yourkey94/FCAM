public class spher {
    public static void main(String[] args){
        for (int i=0 ; i<=10 ; i++){
            for (int j=0 ; j<=10 ; j++){
                for (int k=0 ; k<=10 ; k++){
                    if (Math.pow(i-5,2)+Math.pow(j-5,2)+Math.pow(k-5,2) == 25) {
                        System.out.print('*');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
    }
}
