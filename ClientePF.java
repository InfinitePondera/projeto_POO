package projetofinal;

public class ClientePF extends Cliente {
    // atributos
    private String cpf;

    // Construtor
    public ClientePF(String nome, String fone, Endereco end, String cpf) {
        super(nome, fone, end);
        this.cpf = cpf;
    }

    // get set
    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    // metodos
    public static ClientePF criar() {

        String nome, fone, cpf;
        Endereco end;
        System.out.println("\n Digite o nome do cliente:");
        nome = Leitura.lerString();
        System.out.println("\n Digite o Telefone do cliente:");
        fone = Leitura.lerString();
        System.out.println("\n Digite o CPF do cliente:");
        cpf = Leitura.lerString();
        end = Endereco.criar();

        ClientePF clipf = new ClientePF(nome, fone, end, cpf);
        return clipf;
    }

    public String toString() {
        return super.getNome() + "|" + super.getFone() + "|" + super.getEndereco() + "|" + this.cpf;
    }
}
