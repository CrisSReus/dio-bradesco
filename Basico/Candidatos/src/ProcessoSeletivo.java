package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        imprimirSelecionados();
    }

    static void entrandoEmContato(String candidato){
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativaRealizadas++;
            else System.out.println("Contato realizado com sucesso");
        }while(continuarTentando && tentativaRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com "+ candidato + " na " + tentativaRealizadas + "º tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de tentativas realizadas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int i=0; i < candidatos.length; i++){
            System.out.println("O candidato de nº" + (i + 1) + " é " + candidatos[i]);
        }
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoDeCandidatos(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário =" + salarioPretendido);

            if (salarioBase>=salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++; 
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {System.out.println("Aguardando o resultado dos demais candidatos");}
    }
}