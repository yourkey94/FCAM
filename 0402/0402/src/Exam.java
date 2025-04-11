import java.util.Arrays;

public class Exam {
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 1, 2, 5, 1, 2, 3, 2, 5};
        int counter[] = new int[10];

        for (int i=0 ; i<arr.length ; i++){
            counter[arr[i]]++;
        }
        System.out.println(Arrays.toString(counter));

        int temp=0;
        int an1[] = new int[arr.length];

        for (int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            an1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(an1));
//

        for (int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr.length ; j++){
                if(arr[i]==arr[j] && i!=j){
                    arr[j] = 0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            an1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(an1));
//

        for (int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            an1[i] = arr[i];
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(an1));

    }


}
