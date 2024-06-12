import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class gerenciamento {
    public void salvarDoacao(doaçao doacao, String arquivo) {
        String [] tipos = {"Roupa", "Dinheiro", "Comida"};
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String Tipo = doacao.getTipo();
            if (Tipo.equals("1")) {
                writer.write("Tipo: "+tipos[0]);
            } else if (Tipo.equals("2")) {
                writer.write("Tipo: "+tipos[1]);
            } else if (Tipo.equals("3")) {
                writer.write("Tipo: "+tipos[2]);
                
            }
            writer.newLine();
            writer.write("Quantidade: " + doacao.getQuantidade());
            writer.newLine();
            writer.write("Data: " + doacao.getData());
            writer.newLine();
            writer.newLine(); 
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
