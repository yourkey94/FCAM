import java.util.Arrays;
//야구게임
public class Q1_2 {
    public static void main(String[] args) {
        int k = 3;//숫자 개수
        int[] arr1 = new int[k];//{1, 5, 7};
        int[] arr2 = new int[k];//{3, 5, 9};
        int[] shuf = new int[10];

        for(int i = 0; i< shuf.length ; i++) {
            shuf[i] = i;
        }
        for(int i = 0; i< shuf.length ; i++){
            int temp = 0;
            int random = (int) (Math.random() * 10);
            temp = shuf[i];
            shuf[i] = shuf[random];
            shuf[random] = temp;
        }
        for(int i= 0 ; i < k ;  i++){
            arr1[i]=shuf[i];
        }
        for(int i = 0; i< shuf.length ; i++) {
            int temp = 0;
            int random = (int) (Math.random() * 10);
            temp = shuf[i];
            shuf[i] = shuf[random];
            shuf[random] = temp;
        }
        for(int i= 0 ; i < k ;  i++){
            arr2[i]=shuf[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[k];
        char[] arrF = new char[k];
        int[] arrFN = new int[k];
        int[] arrSB = new int[100];

        for(int i = 0; i< k ; i++) {
            for (int j= 0; j < k ; j++){
                if (arr1[i]==arr2[j] && i==j){
                    arr3[i]="S";
                    break;
                }
                else if (arr1[i]==arr2[j] && i !=j){
                    arr3[i]="B";
                    break;
                }
                else if (arr1[i]!=arr2[j] && i!=j){
                    arr3[i]=" ";
                }
            }
        }
        System.out.println("============");
        System.out.println(Arrays.toString(arr3));

        for (int i=0; i<k ; i++){
            arrF[i] = arr3[i].charAt(0);
            arrFN[i] = (int)arrF[i];
        }
        for (int i=0; i<k ; i++){
            arrSB[arrFN[i]]++;
        }
        System.out.printf("%dS %dB", arrSB[83], arrSB[66]);
    }
}
