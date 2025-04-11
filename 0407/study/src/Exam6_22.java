public class Exam6_22 {
    static boolean isNumber(String str) {
        boolean isNum = true;
        if(str==null || str.length()==0){
            isNum = false;
        }
        else{
                for (int i = 0; i < str.length(); i++) {
                    char x = str.charAt(i);
                    if (!('0' <= x && x <='9')){
                    isNum = false;
                    break;
                    }else isNum = true;
                }
        }
        return isNum;
    }




    public static void main(String[] args) {
        String str = "1234";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));

    }
}
