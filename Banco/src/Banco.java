import java.util.List;

public class Banco {
    
    private List<Conta> Contas;
    private String nome;

    
    public List<Conta> getContas() {
        return Contas;
    }

    public void setContas(List<Conta> contas) {
        Contas = contas;
    }

    

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
