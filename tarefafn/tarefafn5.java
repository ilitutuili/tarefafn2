import java.util.Scanner;

public class tarefafn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int qtdLucroMenor10 = 0;
        int qtdLucroEntre10e20 = 0;
        int qtdLucroMaior20 = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o preço de compra da mercadoria " + i + ":");
            double precoCompra = scanner.nextDouble();
            
            System.out.println("Informe o preço de venda da mercadoria " + i + ":");
            double precoVenda = scanner.nextDouble();
            
            double lucro = ((precoVenda - precoCompra) / precoCompra) * 10;
            
            if (lucro < 10) {
                qtdLucroMenor10++;
            } else if (lucro <= 20) {
                qtdLucroEntre10e20++;
            } else {
                qtdLucroMaior20++;
            }
        }
        
        System.out.println("Quantidade de mercadorias com lucro < 10%: " + qtdLucroMenor10);
        System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%: " + qtdLucroEntre10e20);
        System.out.println("Quantidade de mercadorias com lucro > 20%: " + qtdLucroMaior20);
        
        scanner.close();
    }
}
