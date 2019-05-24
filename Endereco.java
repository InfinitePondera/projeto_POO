public class Endereco {
	//atributos
	private String rua;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;
	//construtores
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
	//metodos
	public Endereco cria() {
		String rua;
		String cep;
		String cidade;
		String estado;
		int numero;
		
		Endereco end = new Endereco(rua, numero, cep, cidade, estado);
		return end;
	}
}
