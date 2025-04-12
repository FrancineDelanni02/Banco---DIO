package src;
import banco.*;

public class Main {
    public static void main(String[] args){
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        cc.imprimirExtrato();
        System.out.println("------------------------");

        Conta cp = new ContaPoupanca();
        cc.transferir(50,cp);

        cc.imprimirExtrato();
        System.out.println("------------------------");
        cp.imprimirExtrato();
    }
}
