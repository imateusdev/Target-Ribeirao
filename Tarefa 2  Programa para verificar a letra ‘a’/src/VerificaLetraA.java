import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Variáveis para contar as ocorrências
        int contador = 0;

        // Verifica cada caractere da string
        for (char letra : input.toCharArray()) {
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        // Exibe o resultado
        System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contador + " vezes.");

        scanner.close();
    }
}
