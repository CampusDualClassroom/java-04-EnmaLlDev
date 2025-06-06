package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");

        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + sumNum(5));
        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20));
        System.out.println("Obtén el factorial del número 7 : " + factorial(7));
        System.out.println("Factorial por método recursivo: " + recursiveFactorial(7));
    }

    public static int sumNum(int num) {
            int sum = 0;
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            return sum;
    }

    public static int sumEvenNum(int num) {
        int sum = 0;
        for (int i = 2; i <= num*2; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }

    //El método factorial() recibe un número entero por parámetro. El método calculará el factorial del número que se solicite en el parámetro.
    public static int factorial(int num) {
//El método factorial() recibe un número entero por parámetro. El método calculará el factorial del número que se solicite en el parámetro.
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num) {
        int resultado = factorial(num);
        return resultado;
    }
}
