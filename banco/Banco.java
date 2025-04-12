package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }
}
