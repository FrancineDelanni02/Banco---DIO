package banco;

public class ContaCorrente extends Conta{
    public void imprimirExtrato(){
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirExtrato();
    }
}
