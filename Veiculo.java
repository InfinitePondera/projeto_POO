package projetofinal;

public class Veiculo
{
    //atributos

    private int veiculoID;
    private String placa;
    private String cor;
    private int nroPortas;
    private char tipoCombustivel;
    private long quilometragem;
    private double valorDiaria;

    //construtores

      public Veiculo(String placa, String cor, int nportas, char combustivel, long kmrodados, double valordiaria)
      {
          this.placa = placa;
          this.cor = cor;
          this.nroPortas = nportas;
          this.tipoCombustivel = combustivel;
          this.quilometragem = kmrodados;
          this.valorDiaria = valordiaria;
      }

    //metodos

    public double calculaCustos(int dias, long km)
    {

    }

}