import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("------배열 사용하기-----");

//        배열 : 하나의 이름으로 여러개의 데이터를 자징하기 위한 데이터 타입
//        자바의 배열은 동일한 데이터 타입의 데이터만 저장할 수 있음
//        배열은 index를 가지고 있으면 데이터를 index를 통해서 구분함
//        index는 0부터 시작
//        new 키워드를 사용해서 배열을 초기화 시 해당 데이터 타입의 초기값으로 초기화됨
//        지정된 크기 이상의 index에 접근 시 오류가 발생함

//        사용법:
//        선언 : 1.데이터 타입 배열명 [] = new 데이터 타입[크기];
//        2.데이터 타입 배열명[]; 배열명 = new 데이터 타입 [크기];
//        3.데이터 타입 배열명[] = {데이터1, 데이터2, 데이터4, ....};
//        사용 : 배열명[index]; //지정한  index에 있는 데이터를 가져옴
//              2.배열명 [index] = 데이터; // 지정한 index에 데이터를 저장

//        빈 배열 선언, 메모리 상에 array1이라는 빈 배열을 등록, 해당 배열을 사용 시 반드시 초기화 작업이 필요함
        int array1[];
//        System.out.println(array1); //초기화 하지 않은 배열을 사용 시 오류가 발생
        array1 = new int[5]; //배열을 초기화 함
        System.out.println("배열 array1의 메모리 주소 : " + array1);
        System.out.println("배열 array1의 index 0의 값 : " + array1[0]);
        array1[2] = 10;
        System.out.println("배열 array1의 index 2의 값 : " + array1[2]);
        System.out.println("배열 array1의 index 4 값 : " + array1[4]);
//        System.out.println("배열 array1의 index 5 값 : " + array1[5]);
        System.out.println("배열 array1의 길이 : " + array1.length);

        System.out.println();

        int array2[] = new int[5];
        System.out.println("배열 array2의 메모리 주소 : " + array2);
        System.out.println("배열 array2의 index 0의 값 : " + array2[0]);
        array2[2] = 20;
        System.out.println("배열 array2의 index 2 값 : " + array2[2]);
        System.out.println("배열 array2의 index 4 값 : " + array2[4]);
//        System.out.println("배열 array2의 index 5 값 : " + array1[5]);
        System.out.println("배열 array2의 길이 : " + array2.length);

        System.out.println();

        int array3[] = {10, 20, 30, 40, 50};
        System.out.println("배열 array3의 메모리 주소 : " + array3);
        System.out.println("배열 array3의 index 0의 값 : " + array3[0]);
        array3[2] = 300;
        System.out.println("배열 array3의 index 2 값 : " + array3[2]);
        System.out.println("배열 array3의 index 4 값 : " + array3[4]);
//        System.out.println("배열 array3의 index 5 값 : " + array1[5]);
        System.out.println("배열 array3의 길이 : " + array3.length);

//      배열을 먼저 선언하고 데이터를 나중에 입력하는 1번 형식으로 배열을 선언 시 3번 형식의 데이터 입력은 불가능
//        int array4[];
//        array4 = {10, 20, 30, 40, 50};//오류 발생
//        array4 = new int[5];//무조건 new를 사용해야 함
//        array4[0] = 10;
//        array4[1] = 20;
//        array4[2] = 30;
//        array4[3] = 40;
//        array4[4] = 50;

//        문제5) int 타입 변수 intArray를 생성하고 크기를 10으로 설정한 후 각 index에 1~10까지의 데이터를 입력하고
//        저장된 데이터를 모두 출력하세요
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("배열 array의 index 0의 값 : " + array[0]);
        System.out.println("배열 array의 index 1의 값 : " + array[1]);
        System.out.println("배열 array의 index 2의 값 : " + array[2]);
        System.out.println("배열 array의 index 3의 값 : " + array[3]);
        System.out.println("배열 array의 index 4의 값 : " + array[4]);
        System.out.println("배열 array의 index 5의 값 : " + array[5]);
        System.out.println("배열 array의 index 6의 값 : " + array[6]);
        System.out.println("배열 array의 index 7의 값 : " + array[7]);
        System.out.println("배열 array의 index 8의 값 : " + array[8]);
        System.out.println("배열 array의 index 9의 값 : " + array[9]);

//        다른방법
//        int intarray[] = new int[10];
//        intarray[0] = 1;
//        intarray[1] = 2;
//        intarray[2] = 3;
//        intarray[3] = 4;
//        intarray[4] = 5;
//        intarray[5] = 6;
//        intarray[6] = 7;
//        intarray[7] = 8;
//        intarray[8] = 9;
//        intarray[9] = 10;


//        문제6) 문제5의 intArray에 저장된 값을 모두 합하는 프로그램을 작성하세요
        System.out.println();

        int sum = 0;

        sum=(array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9]);

        System.out.println("총 합은 : "+ sum);


        System.out.println();

        int a = 10;
        int b = 20;

        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);
//        변수 a의 값을 변수 b에 복사해서 넘겨줌
        b = a;
        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);

//        변수 a의 값을 변경해도 변수 b의 값은 그대로 남아있음, 값을 복사해서 넘겨줬기 때문
        a = 100;
        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);

        System.out.println();
        int arr1[] = {100};
        int arr2[] = {200};
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 주소 : " + arr1[0] + "\t배열 arr2[0]의 주소 : " + arr2[0]);

        arr2 = arr1;
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 주소 : " + arr1[0] + "\t배열 arr2[0]의 주소 : " + arr2[0]);

        arr1[0] =2000;
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 주소 : " + arr1[0] + "\t배열 arr2[0]의 주소 : " + arr2[0]);


//            배열 선언, 크기 5
//        배열 선언시 배열의 크기를 설정하는 부분에 변수 사용 금지(상수는 사용가능)
//        변수는 변경되는 값이기 떄문에 배열의 크기가 어떻게 될지 알 수 없음
//        배열 index 접근에는 변수를 사용하는 것이 가능함
        int arrayInt[];
        arrayInt = new int[5];
        int max = 0;//현재 가장 큰 값을 저장할 변수
        System.out.println("양수 5개를 입력하세요");

        Scanner scanner= new Scanner(System.in);

        for (int i= 0; i < 5; i++){
//            사용자 입력을 통해 얻은 데이터를 배열에 저장
            arrayInt[i] = scanner.nextInt();
//            베얄에 저장된 데이터를 max와 비교
            if (arrayInt[i] > max){
//                max에 배열에 저장된 값을 저장
                max = arrayInt[i];
            }

        }
        System.out.println("가장 큰 수는 " + max +"입니다.");



        System.out.println("\n------for ~ each-------\n");

        System.out.println("\n------기존 for문을 사용한 배열의 데이터 출력\n");
        int arrNum1[] = {10, 20, 30, 40, 50};
        int total1 = 0;

//       반복 조건을 사용자가 지정
        for (int i =0; i < arrNum1.length; i++){
            System.out.println("arrNum1[" + i+ "] : "+ arrNum1[i]);
//            total1 += arrNum1[i];
//            System.out.println("total1 : " + total1);
        }

        for (int i = 0; i < arrNum1.length; i++){
            total1 = total1 + arrNum1[i];
            System.out.println("total : " + total1);
        }

        System.out.println("\n------for ~ each문을 사용한 배열의 데이터 출력\n");
//       반복 가능한 객체의 크기만큼 반복
        int arrNum2[] = {10, 20, 30, 40, 50};
        int total2 = 0;

        for (int num : arrNum2){
            System.out.println("num : " + num);
        }

        for (int num : arrNum2){
            total2 = total2 +num;
            System.out.println("total2 : "+ total2);
        }


        int [] n = {1, 2, 3, 4, 5 };
        int sum1 = 0;
        for(int k : n){
            System.out.print(k + " ");
            sum1 += k;
        }

        System.out.println("합은 "+ sum1);

        String f[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        for(String s : f)
            System.out.println(s + " ");

    }
}