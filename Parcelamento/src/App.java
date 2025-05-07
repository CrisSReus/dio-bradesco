/*import java.util.Scanner;

public class App {
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double valorTotal = scanner.nextDouble();
        int numeroParcelas = scanner.nextInt();
        double valorParcela = valorTotal/numeroParcelas;
        
       // TODO: Crie a lógica para verificar se o parcelamento é possível:
        if(valorParcela>= 1){
            String valorFormatado = String.format("%.2f", valorParcela);
            System.out.println("Parcela: " + valorFormatado);

        } else {
            System.out.println("Parcelamento nao e possivel");
        }
       
      // A condição deve garantir que o valor de cada parcela seja maior ou igual a 1. 
       


        scanner.close();
    }
}
*/
/*
 * Descrição
Implemente um programa que simule o parcelamento de um pagamento. O programa deve receber o valor total e o número de parcelas, e calcular o valor de cada parcela. Caso o número de parcelas seja maior que o valor total, o programa deve indicar que o parcelamento não é possível.

Entrada
Um número decimal representando o valor total.
Um número inteiro representando o número de parcelas.
Saída
O valor de cada parcela ou uma mensagem indicando que o parcelamento não é possível.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	    Saída
1000.00
4	        Parcela: 250.00

8.00
10	        Parcelamento nao e possivel

1200.00
6	        Parcela: 200.00
 */
