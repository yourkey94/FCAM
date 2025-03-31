public class D03_28 {
    public static void main(String[] args) {
        System.out.println("1번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("2번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }

        System.out.println("3번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 6 - j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("4번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print('*');
                } else if (i == 6 - j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("5번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("6번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= 6 - j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();

        }

        System.out.println("6-2번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (5 - i >= j) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }

        System.out.println("7번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i >= j-4) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("8번");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i >= j-4 && i >= 6-j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("9번");
        for (int i=1 ; i <=5 ; i++){
            for(int j=1 ; j <=5 ; j++){
                if (i<=j && i<=6-j) {
                    System.out.print('*');
                }
                else if (i>=j && i>=6-j){
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }


        System.out.println("9번-2");
        for (int i=1 ; i <=5 ; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i <= j && i <= 6 - j) || (i >= j && i >= 6 - j)) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println("10번");
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++){
                if ((i < j && i < 6 -j ) || (i > j && i > 6-j)) {
                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }

        System.out.println("test");
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                if ((Math.pow(i-6, 2)+Math.pow(j-6, 2) <=20)
                        && (Math.pow(i-6, 2)+Math.pow(j-6, 2) >=14)
                        || (Math.pow(i-6, 2)+Math.pow(j-6, 2) <=4)) {
                    System.out.print('*');
                    }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        System.out.println("-------");
    }
}

