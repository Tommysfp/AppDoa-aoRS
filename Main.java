public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface();
        doaçao doacao = myInterface.receberEntrada();
        
        System.out.println("Doação recebida:");
        System.out.println("Tipo: " + doacao.getTipo());
        System.out.println("Quantidade: " + doacao.getQuantidade());
        System.out.println("Data: " + doacao.getData());
        
        gerenciamento gerenciamento = new gerenciamento();
        gerenciamento.salvarDoacao(doacao, "doacoes.txt");
        
        System.out.println("Doação salva no arquivo doacoes.txt");
    }
}
