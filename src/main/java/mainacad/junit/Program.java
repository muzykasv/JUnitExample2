package mainacad.junit;

public class Program {

    public static void main(String[] args){
        Numbers numbers = new Numbers();

        int resultSum = numbers.sum(5);
        System.out.println("Сумма N чисел = " + resultSum);

        int resultAdd = numbers.add(5, 28);
        System.out.println("Сумма двух чисел = " + resultAdd);

        int resultDiv = numbers.div(100, 4);
        System.out.println("Деление двух чисел = " + resultDiv);

        int resultMult = numbers.mult(100, 5);
        System.out.println("Умножение двух чисел = " + resultMult);

        int resultSub = numbers.sub(100, 88);
        System.out.println("Вычитание двух чисел = " + resultSub);

        int resultPower = numbers.power(2, 6);
        System.out.println("Возведение числа в степень = " + resultPower);

        int resultPowerAdd = numbers.power(2, 6) + numbers.power(2, 8);
        System.out.println("Сумма двух возведенных чисел в степени = " + resultPowerAdd);

        double resultSqrt = numbers.sqrt(81);
        System.out.println("Извлечение квадратного корня из числа = " + resultSqrt);

        double resultSqrtNegative = numbers.sqrt(-64);
        System.out.println("Извлечение квадратного корня из отрицательного числа = " + resultSqrtNegative);

        double resultPowTwo = numbers.powTwo(100);
        System.out.println("Возведение числа в степень = " + resultPowTwo);
    }
}
