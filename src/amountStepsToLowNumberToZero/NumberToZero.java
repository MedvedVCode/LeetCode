package amountStepsToLowNumberToZero;

// TODO: 29.09.2022 Дано число, если оно четное, то делить на 2, если нет - вычесть 1.
//  Посчитать количество шагов, пока число не станет 0.

public class NumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if(num % 2 == 0){
                num /=2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
