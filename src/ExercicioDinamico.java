import java.math.BigInteger;
import java.util.Scanner;

public class ExercicioDinamico {

    // Método recursivo para calcular o fatorial de um número (Top-Down Approach com Memoization)
    public static BigInteger factorialTopDown(int n, BigInteger[] memo) {
        // Condição de parada
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        // Verificar se já foi calculado
        if (memo[n] != null) {
            return memo[n];
        }
        // Calcular e armazenar no memo
        memo[n] = BigInteger.valueOf(n).multiply(factorialTopDown(n - 1, memo));
        return memo[n];
    }

    // Método iterativo para calcular o fatorial de um número (Bottom-Up Approach)
    public static BigInteger factorialBottomUp(int n) {
        BigInteger[] dp = new BigInteger[n + 1];
        dp[0] = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            dp[i] = BigInteger.valueOf(i).multiply(dp[i - 1]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial (acima de 100 é suportado):");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            // Top-Down Approach
            BigInteger[] memo = new BigInteger[number + 1];
            BigInteger resultTopDown = factorialTopDown(number, memo);
            System.out.println("(Top-Down) O fatorial de " + number + " é: " + resultTopDown);

            // Bottom-Up Approach
            BigInteger resultBottomUp = factorialBottomUp(number);
            System.out.println("(Bottom-Up) O fatorial de " + number + " é: " + resultBottomUp);
        }

        scanner.close();
    }
}