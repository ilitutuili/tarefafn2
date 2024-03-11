import java.util.Scanner;

public class tarefafn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPÇÃO: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("O comprimento da frase é: " + frase.length());
                    break;
                case 2:
                    if (frase.length() < 2) {
                        System.out.println("A frase é muito curta para imprimir os dois primeiros e os dois últimos caracteres.");
                    } else {
                        System.out.println("Os dois primeiros caracteres da frase são: " + frase.substring(0, 2));
                        System.out.println("Os dois últimos caracteres da frase são: " + frase.substring(frase.length() - 2));
                    }
                    break;
                case 3:
                    System.out.println("A frase espelhada é: " + new StringBuilder(frase).reverse().toString());
                    break;
                case 4:
                    System.out.println("Terminando o algoritmo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
