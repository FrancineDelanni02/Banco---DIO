package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public boolean adicionarCliente(Cliente cliente){
        return clientes.add(cliente);
    }

    public boolean criarConta(Conta conta){
        return contas.add(conta);
    }

    public void listarClientes(){
        System.out.println("=== Lista de clientes ===");
        clientes.forEach(c -> {
            System.out.println(c.getNome());
        });
    }
}
