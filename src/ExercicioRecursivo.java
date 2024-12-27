import java.math.BigInteger;
import java.util.Scanner;

public class ExercicioRecursivo {
    // Método recursivo para calcular o fatorial de um número
    public static BigInteger factorial(int n) {
        // Condição de parada
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        // Chamada recursiva
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial (acima de 100 é suportado):");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            BigInteger result = factorial(number);
            System.out.println("O fatorial de " + number + " é: " + result);
        }

        scanner.close();
    }
}