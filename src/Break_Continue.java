import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        break : 반복문 내에서 break를 만나면 해당 반복문 즉시 중단
        System.out.println("\n------break------\n");
        for (int i =0; i <10; i ++){
          if (i == 5){
              break;
          }
            System.out.println("햔재 i의값 : " +i);
        }

//        continue : 반복문 내에서 continue를 만나면 해당 루프만 중단하고 다음 루프로 넘어감
        System.out.println("\n------continue------\n");
        for (int i =0; i <10; i ++){
            if (i ==5){
                continue;
            }
            System.out.println("while문 사용시 현재 i의값 : " +i);
        }


//        문제4)구구단 전체를 출력하는 프로그램을 작성하세요
//        조건1)사용자 입력으로  2~9까지의 숫자를 하나 입력받기
//        조건2)사용자 입력으로 입력 받은 단수에 break와 continue를 사용하는 구구단을 작성하세요

        System.out.println("\n------문제4-------\n");

//        System.out.println("\n------break------\n");
//        System.out.println("원하는 단수를 입력하세요");
//        int den = scanner.nextInt();
//        for (int i =0; i <10; i ++){
//            if (i == 5){
//                break;
//            }
//            System.out.println(den +"*"+ i+ "="+(den * i));
//        }

        System.out.println("\n------break------\n");
        System.out.println("원하는 단수를 입력하세요");
        int num = scanner.nextInt();
        for (int i =0; i <10; i ++){
            if (i==num){
                break;
            }
            System.out.println("\n------"+i+"단------\n");
            for (int j= 1; j < 10; j++){
                System.out.println(i+ "*"+ j+ "="+(i*j));
            }
        }





//        System.out.println("\n------continue------\n");
//        System.out.println("원하는 단수를 입력하세요");
//         = scanner.nextInt();
//        for (int i =0; i <10; i ++){
//            if (i ==5){
//                continue;
//            }
//            System.out.println(den+"*"+i+"="+(den*i));
//        }
        System.out.println("원하는 단수를 입력하세요");
        num = scanner.nextInt();
        for (int i =0; i <10; i ++){
            if (i==num){
                continue;
            }
            System.out.println("\n------"+i+"단------\n");
            for (int j= 1; j < 10; j++){
                System.out.println(i+ "*"+ j+ "="+(i*j));
            }
        }

    }
}
