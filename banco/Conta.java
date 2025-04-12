package banco;

public abstract class Conta implements InterfaceConta{

    private int numero;
    private int agencia;
    private double saldo;

    public boolean sacar(){
        return true;
    }

    public boolean depositar(){
        return true;
    }

    public boolean transferir(){
        return true;
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
