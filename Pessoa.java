package Poo1;

public class Pessoa {
    
    // atributos
    private String nome;
    private String cpf;
    private String fone;
    private Endereco endereco;

    // construtores
    public Pessoa(String nome, Endereco end) {
        this(nome, "", end);
    }

    public Pessoa(String nome, String cpf, Endereco end) {
        this(nome, cpf, "", end);
    }

    public Pessoa(String nome, String cpf, String fone, Endereco end) {
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cp) {
        this.cpf = cp;
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
