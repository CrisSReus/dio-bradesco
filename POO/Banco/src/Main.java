<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
}
}
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
}
}
>>>>>>> 5c227961749dce52960b76af430524dee76f2cec
