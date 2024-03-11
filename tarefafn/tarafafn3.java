import java.util.Scanner;

public class  tarafafn3{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Criando um vetor para armazenar os nomes
        String[] nomes = new String[5];
        
        // Preenchendo o vetor com os nomes
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";
        nomes[3] = "Ana";
        nomes[4] = "José";
        
        // Pedindo ao usuário para digitar um número correspondente a um nome
        System.out.println("Digite um número de 1 a 5 correspondente a uma pessoa:");
        Scanner scanner = new Scanner(System.in);
        int indice = scanner.nextInt();
        
        // Verificando se o índice está dentro do intervalo válido
        if (indice >= 1 && indice <= 5) {
            // Obtendo o nome correspondente ao índice digitado
            String nome = nomes[indice - 1];
            System.out.println("O nome correspondente ao número digitado é: " + nome);
        } else {
            System.out.println("Número inválido. Por favor, digite um número de 1 a 5.");
        }
    }
}
