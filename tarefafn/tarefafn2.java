import java.util.Scanner;

public class tarefafn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 5;
        String[] nomes = new String[numAlunos];
        double[][] notas = new double[numAlunos][2];
        double[] medias = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (i+1) + ":");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a primeira nota do aluno " + (i+1) + ":");
            notas[i][0] = scanner.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + (i+1) + ":");
            notas[i][1] = scanner.nextDouble();
            scanner.nextLine(); 

            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        System.out.println("\nListagem de Alunos:");
        System.out.println("-------------------");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Nota 1: " + notas[i][0]);
            System.out.println("Nota 2: " + notas[i][1]);
            System.out.println("Média: " + medias[i]);
            System.out.println("-------------------");
        }

        scanner.close();
    }
}
