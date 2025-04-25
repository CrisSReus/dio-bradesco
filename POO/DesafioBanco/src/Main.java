// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

import java.util.Scanner;

class Conta {
    
    // TODO: Implemente os atributos privados para garantir que só podem ser acessados dentro da classe:
    public double saldoInicial;
    public int numeroConta;
    public String titular;   
    // TODO: Crie o construtor para inicializar os atributos da conta:
    public Conta(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }
    
    // TODO: Adicione o método público para consultar o saldo:
    public double consultarSaldo() {
        return saldoInicial;
    }

    // TODO: Adicione o método público para realizar saque:
    public boolean sacar(double valorSaque) {
        if (saldoInicial<valorSaque) {
            return false;
        } else {
          saldoInicial = saldoInicial - valorSaque;
          return true;}
    }
   
    // TODO: Crie o método público para realizar depósito
    public void depositar(double valorDeposito) {
        saldoInicial = saldoInicial + valorDeposito;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do titular");
        String titular = sc.nextLine(); 
        System.out.println("Digite o numero da conta");
        int numeroConta = sc.nextInt(); 
        System.out.println("Digite o saldo");
        double saldoInicial = sc.nextDouble(); 

        Conta conta = new Conta(titular,numeroConta, saldoInicial);

        System.out.println("Digite o valor do saque");
        // Operações de saque e depósito
        if (sc.hasNextDouble()) { 
            double valorSaque = sc.nextDouble();
            if (!conta.sacar(valorSaque)) { 
                System.out.println("Saque invalido: Saldo insuficiente");
                System.out.println("Saldo Atual: " + String.format("%.2f", conta.consultarSaldo()));
                return;
            }
        }

        System.out.println("Digite o valor do deposito");
        if (sc.hasNextDouble()) { 
            double valorDeposito = sc.nextDouble(); 
            conta.depositar(valorDeposito); 
        }

        // Imprime o saldo final atualizado
        System.out.println("Saldo Atualizado: " + String.format("%.2f", conta.consultarSaldo()));

        sc.close(); // Fecha o scanner
    }
}
}