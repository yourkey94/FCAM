public class Exam6_23 {
    static int max(int[] arr){
        if(arr==null || arr.length == 0){
            return -999999;
        }
        else {
            int maxnum=0;
            java.util.Arrays.sort(arr);
            maxnum=arr[arr.length-1];
            return maxnum;

        }
    }


    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));
    }
}
