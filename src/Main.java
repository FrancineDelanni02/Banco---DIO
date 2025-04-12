package src;
import banco.*;

public class Main {
    public static void main(String[] args){
        Banco b = new Banco("BB");
        Cliente c1 = new Cliente("José");
        Cliente c2 = new Cliente("Francine");
        b.adicionarCliente(c1);
        b.adicionarCliente(c2);

        Conta cc = new ContaCorrente(c1);
        b.criarConta(cc);
        cc.depositar(100);

        cc.imprimirExtrato();
        System.out.println("------------------------");

        Conta cp = new ContaPoupanca(c2);
        b.criarConta(cp);
        cc.transferir(50,cp);

        cc.imprimirExtrato();
        System.out.println("------------------------");
        cp.imprimirExtrato();

        b.listarClientes();
    }
}
