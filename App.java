package lv2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
// 내기 전에 클래스명 바꾸고 내기 App 으로 !

        int num1 = 0;
        int num2 = 0;

        String exitA = "";

        String delResult;

        while (!exitA.equals("exit")) {

            Scanner input = new Scanner(System.in);

            System.out.print("첫번째 숫자를 입력하세요. : ");
            num1 = input.nextInt();
            System.out.print("두번째 숫자를 입력하세요. : ");
            num2 = input.nextInt();

            System.out.print("사칙연산을 입력하세요. : ");
            char op = input.next().charAt(0);

            Calculator calculator = new Calculator(num1, num2, op);

            calculator.calculate();

            int newResult = calculator.getResult();
            System.out.println("결과 : " + newResult);

            input.nextLine(); //줄이 띄어져 nextLine() 오류 없애는 용도로 사용

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            exitA = input.nextLine();

            if (exitA.equals("exit")) {

                System.out.println("지금까지의 결과값 입니다. : " + calculator.getResultSaved());


                System.out.print("처음 저장된 결과를 삭제할까요? (o 입력 시 삭제): ");
                delResult = input.nextLine();

                if (delResult.equals("o")) {
                    calculator.removeResult();
                    System.out.println("삭제 후 결과값: " + calculator.getResultSaved());
                    System.out.println("결과값을 수정하시겠습니까? (o 입력 시 수정): ");
                    delResult = input.nextLine();

                    if (delResult.equals("o")) {
                        System.out.println("입력할 수정할 결과값을 입력 하세요. : ");
                        newResult = input.nextInt();
                        input.nextLine(); //줄이 띄어져 nextLine() 오류 없애는 용도로 사용

                        List<Integer> newList = new ArrayList<>();
                        newList.add(newResult);
                        calculator.setResultSaved(newList);

                        System.out.println("수정된 결과 목록: " + calculator.getResultSaved());

                    }

                }

                break;
            }
        }
    }
}

//
