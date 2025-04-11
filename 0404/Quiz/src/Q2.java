/* 5*5크기의 2차원 배열을 받아서
빙고의 갯수를 반환하는 메서드
bingoCnt를 작성하시오
 */

public class Q2 {
    public static void main(String[] args) {
        int k = 3; //k*k빙고 만들기(k는 홀수)
        int[][] arr = new int[k][k];
        for (int i=0 ; i < arr.length ; i++){
            for (int j=0 ;j < arr[i].length ; j++){
                arr[i][j] = (int)(Math.random()*2);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print(bingoCnt(arr, k));
        System.out.print("빙고");
    }

    static int bingoCnt(int arr[][], int k) {
        int counter = 0;
        int temp = 0;

        //1. 가로 빙고
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = 0; j < arr[i].length; j++) {
                temp = arr[i][j] + temp;
                if (temp == k) {
                    counter++;
                }

            }
        }
        //2. 세로빙고
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = 0; j< arr[i].length; j++) {
                temp = arr[j][i] + temp;
                if (temp == k) {
                    counter++;
                }

            }
        }
        //3. 대각선 빙고(좌>우)
        temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i][i] + temp;
            if (temp == k) {
                counter++;
            }
        }
        //4. 대각선 빙고(우>좌)
        temp = 0;
        for (int i = 0; i < arr.length; i++) {
            k = k-1;
            temp = arr[k-i][i] + temp;
            k = k+1;
            if (temp == k) {
                counter++;
            }
        }
        return counter;
    }
}
