package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static List<Integer> resultSaved = new ArrayList<>();

    //속성
    int num1;
    int num2;
    char op;
    private  int result = 0;
    String exitA;

    //생성자
    Calculator(int num1, int num2, char op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }


    //기능
    int getResult() {

        return this.result;
    }

    int calculate () {
            if (op == '+') {
                result = num1 + num2;

            } else if (op == '-') {
                result = num1 - num2;

            } else if (op == '*') {
                result = num1 * num2;

            } else if (op == '/') {
                if (num2 != 0) {
                    result = num1 / num2;

                } else {
                    System.out.println("나누셈 연산에서 분모에 0이 입력된 수 없습니다. ");
                    return 0;
                }

            }
        resultSaved.add(result);
            return result;

    }
    public List<Integer> getResultSaved() {
        return resultSaved;
    }
    public void setResultSaved(List<Integer> newList) {
        this.resultSaved = newList;
    }

    public void removeResult() {
        if (!resultSaved.isEmpty()) {
            this.resultSaved.remove(0);
        } else {
            System.exit(0);
        }
    }
}
