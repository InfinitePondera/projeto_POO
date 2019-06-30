package projetofinal;

public class ClientePJ extends Cliente {
    // atributos
    private String cnpj;
    private String nomeMotorista;

    // Construtor
    public ClientePJ(String nome, String fone, Endereco end, String cnpj, String nomeMotorista) {
        super(nome, fone, end);
        this.cnpj = cnpj;
        this.nomeMotorista = nomeMotorista;
    }

    // get set
    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    // metodos
    public static ClientePJ criar() {

        String nome, fone, cnpj, nomeMotorista;
        Endereco end;

        nome = Leitura.lerString();
        fone = Leitura.lerString();
        cnpj = Leitura.lerString();
        end = Endereco.criar();
        nomeMotorista = Leitura.lerString();

        ClientePJ clipj = new ClientePJ(nome, fone, end, cnpj, nomeMotorista);
        return clipj;
    }

    //
    public String toString() {
        return super.getNome() + "|" + super.getFone() + "|" + super.getEndereco() + "|" + this.cnpj + "|"
                + this.nomeMotorista;
    }
}
