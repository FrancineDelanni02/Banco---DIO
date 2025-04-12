package banco;

public abstract class Conta implements InterfaceConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int numero;
    private int agencia;
    private double saldo;

    public Conta(){
       this.numero = SEQUENCIAL++;
       this.agencia = Conta.AGENCIA_PADRAO;
       this.saldo = 0;
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
}
