
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Implemente o código para  ler as 3 transações:
        double primeiroValor = scanner.nextDouble();
        double segundoValor = scanner.nextDouble();
        double terceiroValor = scanner.nextDouble();

        // Esses valores representam as transações realizadas.
        // Armazene cada valor no array `transacoes` para processá-los depois.
        double[] transacoes = {primeiroValor, segundoValor, terceiroValor};

        // TODO: Realize a leitura do valor mínimo (4ª entrada):

        double valorMinimo = scanner.nextDouble();
       // Este valor será usado como o critério para contar as transações maiores que ele.

        int contador = 0;

        // TODO: Conte as transações maiores que o valor mínimo e verifique se cada valor no array `transacoes`:
        for (int i = 0; i < transacoes.length; i++) {
            if (transacoes[i] >= valorMinimo) 
            contador++;
          }
       // Caso o valor seja maior que o `valorMinimo`, incrementem o contador.

   
        System.out.println(contador);
    }
}
/*
 * Descrição
Implemente um programa que leia uma lista de valores de transações e conte quantas dessas transações são superiores a um valor mínimo especificado pelo usuário.

Entrada
O programa deverá receber exatamente 4 entradas, onde:

As 3 primeiras entradas representam os valores das transações realizadas.
A 4ª entrada será o valor mínimo que servirá como critério de comparação.
Saída
O programa deverá exibir um único número inteiro, que é o total de transações cujos valores são maiores que o valor mínimo.

Regras Importantes:

As entradas devem ser fornecidas linha por linha.
A ordem das entradas é importante:
Primeiras 3 linhas: valores das transações.
4ª linha: valor mínimo.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	        Saída
100.00
250.00
400.00
200.00	            2

50.00
60.00
70.00
100.00	            0

500.00
300.00
200.00
250.00	            2
 */