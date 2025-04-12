package banco;

public abstract class Conta implements InterfaceConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int numero;
    private int agencia;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
       this.numero = SEQUENCIAL++;
       this.agencia = Conta.AGENCIA_PADRAO;
       this.saldo = 0;
       this.cliente = cliente;
    }

    public boolean sacar(double valor){
        if(saldo < valor)
            return false;

        saldo -= valor;
        return true;
    }

    public boolean depositar(double valor){
        saldo += valor;
        return true;
    }

    public boolean transferir(double valor,Conta contaDestino){
        if(sacar(valor))
            contaDestino.depositar(valor);

        return false;
        }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato(){
        System.out.println("Nome do cliente: "+this.cliente.getNome());
        System.out.println("Agência: "+ this.agencia);
        System.out.println("Número: "+this.numero);
        System.out.println("Saldo: "+this.saldo);
    }
}
