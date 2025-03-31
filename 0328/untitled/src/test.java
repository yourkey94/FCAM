import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String com[] = {"rock", "scissor", "paper"};
        int l = com.length;
        int n = (int) (Math.random() * l);
        int re = 2;

        for (;;) {
            System.out.println("가위바위보 중 무엇을 내시겠습니까?");
            String user = sc.nextLine();
            re = 2 ;
            if (com[n].equals("rock")) {
                if (user.equalsIgnoreCase("scissor") || user.equals("가위")) {
                    System.out.println("패배하셨습니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }
                } else if (user.equalsIgnoreCase("rock") || user.equals("바위")) {
                    System.out.println("비겼습니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }
                } else if (user.equalsIgnoreCase("paper") || user.equals("보")) {
                    System.out.println("이겼습니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        n = (int) (Math.random() * 3);
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }

                }
                else {
                    System.out.println("옳바르지 않은 입력입니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
                    else if (re == 1) {
                        continue;
                    }
                }
            } else if (com[n].equals("scissor")) {
                if (user.equalsIgnoreCase("rock") || user.equals("바위")) {
                    System.out.println("이겼습니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        n = (int) (Math.random() * 3);
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }
                } else if (user.equalsIgnoreCase("scissor") || user.equals("가위")) {
                    System.out.println("비겼습니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }
                } else if (user.equalsIgnoreCase("paper") || user.equals("보")) {
                    System.out.println("패배하셨습니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        System.out.println("가위바위보 중 무엇을 내시겠습니까?");
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }
                }
                else {
                    System.out.println("옳바르지 않은 입력입니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
                    else if (re == 1) {
                        continue;
                    }
                }
            } else if (com[n].equals("paper")) {
                if (user.equalsIgnoreCase("rock") || user.equals("바위")) {
                    System.out.println("패배하셨습니다");
                    System.out.println("다시 하시겠습니까? (예:1 아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }
                } else if (user.equalsIgnoreCase("scissor") || user.equals("가위")) {
                    System.out.println("이겼습니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        n = (int) (Math.random() * 3);
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }
                } else if (user.equalsIgnoreCase("paper") || user.equals("보")) {
                    System.out.println("비겼습니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 1) {
                        continue;
                    } else if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    } else {
                        System.out.println("옳바르지 않은 입력입니다.");
                        continue;
                    }
                } else {
                    System.out.println("옳바르지 않은 입력입니다.");
                    System.out.println("다시 하시겠습니까?(예:1  아니오:0)");
                    re = sc.nextInt();
                    sc.nextLine();
                    if (re == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
                    else if (re == 1) {
                        continue;
                    }
                }
            }
        }

        sc.close();
    }
}