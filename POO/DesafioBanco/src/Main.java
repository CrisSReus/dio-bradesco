// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

abstract class Conta {
    protected double saldo; 
    
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor);
    
    public void exibirSaldo() {
        System.out.printf("Saldo Atual: %.2f%n", saldo);
    }
}


class ContaCorrente extends Conta {
    private double limite; 
        
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        // TODO: Implemente a lógica para verificar se o saque é permitido considerando o saldo e o limite:
        // Dica: Se saldo - valor >= -limite, o saque é permitido.
        if (saldo - valor >= limite) {
            if(saldo >= valor){
                saldo = saldo - valor;
            } else {
                saldo = saldo + limite - valor;
            }
        }
        exibirSaldo(); // Exibe o saldo atualizado
    }
}


class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    // Implementação do método sacar para Conta Poupança
    @Override
    public void sacar(double valor) {
        // TODO: Implemente a lógica para verificar se o saque é permitido considerando apenas o saldo:
        // Dica: Se saldo >= valor, o saque é permitido.
        if (saldo>=valor) {
            saldo = saldo - valor;
        }

        exibirSaldo(); // Exibe o saldo atualizado
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tipo conta");
        String tipoConta = scanner.next();
        System.out.println("titular");
        String titular = scanner.next();
        System.out.println("numero"); 
        int numeroConta = scanner.nextInt();
        System.out.println("saldo");
        double saldo = scanner.nextDouble(); 

        Conta conta;

        // TODO: Implemente a lógica para criar uma instância de ContaCorrente ou ContaPoupanca:
        // Dica: Use um if para verificar o tipo da conta.

        // TODO: Para Conta Corrente, leia também o limite de cheque especial e crie a instância.
        double limite = scanner.nextDouble();

        
  
        // TODO: Para Conta Poupança, apenas inicialize a conta com o saldo inicial:


        while (scanner.hasNextDouble()) {
            double valorSaque = scanner.nextDouble(); 
            conta.sacar(valorSaque); 
        }

        scanner.close(); 
    }
}
/*// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
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
}*/