import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        try {
        //conhecer e importar classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            //configurar dados
            int conta;
            int agencia;
            String nomeCliente;
            float saldo;

            //obter dados pelo scanner
            System.out.println("Por favor, digite o número da Agência !");
            agencia = scanner.nextInt(); 
            
            System.out.println("Por favor, digite o número da Conta !");
            conta = scanner.nextInt();

            System.out.println("Por favor, digite o nome do Cliente !");
            nomeCliente = scanner.next();

            System.out.println("Por favor, digite o Saldo !");
            saldo = scanner.nextFloat();
        
            // retornar mensagem para o cliente
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");   
        } catch (InputMismatchException e) {
            System.out.println("Os campos número de agencia e número de conta precisam ser numéricos.");
        }
    }
}
