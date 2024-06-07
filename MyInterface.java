import java.util.Scanner;

public class MyInterface {
    public doaçao receberEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo da doação: (1) Roupa (2) dinheiro (3) comida");
        String tipo = scanner.nextLine();
        System.out.println("Digite a quantidade da doação: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a data da doação: ");
        String data = scanner.nextLine();
        
        scanner.close();

        doaçao doacao = new doaçao(tipo, quantidade, data);
        return doacao;
    }
}
