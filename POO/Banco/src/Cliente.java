import java.util.Scanner;

public class Cliente {
    private String nome;

    public String getNome() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
