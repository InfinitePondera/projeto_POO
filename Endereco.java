package projetofinal;

public class Endereco {

    // atributos
    private String rua;
    private int numero;
    private String cep;
    private String cidade;
    private String estado;

    // construtores
    public Endereco(String rua) {
        this(rua, 0);
    }

    public Endereco(String rua, int numero) {
        this(rua, numero, "");
    }

    public Endereco(String rua, int numero, String cep) {
        this(rua, numero, cep, "");
    }

    public Endereco(String rua, int numero, String cep, String cidade) {
        this(rua, numero, cep, cidade, "");
    }

    public Endereco(String rua, int numero, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    // gets e sets
    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return this.cep;
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString()
    {
        return this.rua + "|" + this.numero + "|" + this.cep + "|" +  this.cidade + "|" +  this.estado;
    }
    
    // metodos
    public static Endereco criar() {
        
        String rua, cep, cidade, estado;
        int numero;
       
        System.out.println("\n Digite o nome da Rua: ");
        rua = Leitura.lerString();
        System.out.println("\n Digite o numero da Rua: ");
        numero = Leitura.lerInt();
        System.out.println("\n Digite o CEP: ");
        cep = Leitura.lerString();
        System.out.println("\n Digite o nome da cidade: ");
        cidade = Leitura.lerString();
        System.out.println("\n Digite a sigla do estado: ");
        estado = Leitura.lerString();

        Endereco end = new Endereco(rua, numero, cep, cidade, estado);
        return end;
    }
}
