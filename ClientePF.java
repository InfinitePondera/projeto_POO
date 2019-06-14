package projetofinal;

public class ClientePF extends Cliente {
    //atributos
    private String cpf;
    //Construtor
    public ClientePF(String nome, String fone, Endereco end, String cpf) {
        super(nome, fone, end);
        this.cpf = cpf;
    }
    //get set
    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    //metodos
    public static ClientePF cria() {
        
        String nome, fone, cpf;
        Endereco end;

        nome = Leitura.lerString();
        fone = Leitura.lerString();
        cpf = Leitura.lerString();
        end = Endereco.cria();

        ClientePF clipf = new ClientePF(nome, fone, end, cpf);
        return clipf;
    }
}