public class Pessoa {
	//atributos
	private String nome;
	private String cpf;
	private String fone;
	private Endereco endereco;
	//construtores
	public Pessoa(String nome) {
		this(nome, "");
	}
	public Pessoa(String nome, String cpf) {
		this(nome, cpf, "");
	}
	public Pessoa(String nome, String cpf, String fone) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.endereco = endereco;
	}
	//metodos
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
