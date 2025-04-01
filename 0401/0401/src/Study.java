public class Study {
    public static void main(String[] args){
        int k = 10;
        int[][] a = new int[k][k];
        System.out.println(a.length);
        for(int i=0 ; i < a.length ; i++){
            for(int j=0 ; j < a.length ; j++){
                a[i][j] = (int)(Math.random() *10);
                System.out.print(a[i][j]);
            }System.out.println();
        }
    }
}
