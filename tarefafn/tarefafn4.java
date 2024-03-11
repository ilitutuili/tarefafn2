import java.util.Scanner;

public class tarefafn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[15];
        double[] notasPR1 = new double[15];
        double[] notasPR2 = new double[15];
        double[] medias = new double[15];
        String[] situacoes = new String[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o nome do aluno " + (i+1) + ":");
            nomes[i] = scanner.nextLine();
            
            System.out.println("Digite a nota da PR1 do aluno " + nomes[i] + ":");
            notasPR1[i] = scanner.nextDouble();
            
            System.out.println("Digite a nota da PR2 do aluno " + nomes[i] + ":");
            notasPR2[i] = scanner.nextDouble();
            
            scanner.nextLine(); 
        }
        
        for (int i = 0; i < 15; i++) {
            medias[i] = (notasPR1[i] + notasPR2[i]) / 2;
            situacoes[i] = (medias[i] >= 6.0) ? "AP" : "RP";
        }
        
        System.out.println("Listagem dos alunos:");
        System.out.println("Nome\t\tPR1\tPR2\tMédia\tSituação");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%s\n", nomes[i], notasPR1[i], notasPR2[i], medias[i], situacoes[i]);
        }
        
        scanner.close();
    }
}
