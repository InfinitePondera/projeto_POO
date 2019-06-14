package projetofinal;

public class Cliente {
    
    // atributos
    private String nome;
    private String fone;
    private Endereco endereco;

    // construtores
    public Cliente(String nome, Endereco end) {
        this(nome, "", end);
    }

    public Cliente(String nome, String fone, Endereco end) {
        this.nome = nome;
        this.fone = fone;
        this.endereco = end;
    }

    // metodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nm) {
        this.nome = nm;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fon) {
        this.fone = fon;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco end) {
        this.endereco = end; 
    }


}
