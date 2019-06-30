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
        this.veiculoID = Utilitaria.idVeiculo;
        Utilitaria.idVeiculo++;
        this.placa = placa;
        this.cor = cor;
        this.nroPortas = nportas;
        this.tipoCombustivel = combustivel;
        this.quilometragem = kmrodados;
        this.valorDiaria = valordiaria;
    }
    //get set
    public int getVeiculoID(){
        return this.veiculoID;
    }
    public void setVeiculoID(int veiculoID){
        this.veiculoID = veiculoID;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public int getNroPortas(){
        return this.nroPortas;
    }
    public void setNroPortas(int nroPortas){
        this.nroPortas = nroPortas;
    }
    public char getTipoCombustivel(){
        return this.tipoCombustivel;
    }
    public void setTipoCombustivel(char tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    public long getQuilometragem(){
        return this.quilometragem;
    }
    public void setQuilometragem(long quilometragem){
        this.quilometragem = quilometragem;
    }
    public double getValorDiaria(){
        return this.valorDiaria;
    }
    public void setValorDiaria(double valordiaria){
        this.valorDiaria = valordiaria;
    }
    //metodos

    public double calculaCustos(int dias, long km)
    {
        double custo;
        int diferenca;

        diferenca = km - (dias * 100);         
        custo = valorDiaria * dias;

        if(diferenca>0)
        {
            for(int i = 0;i<diferenca;i++)
            {
                custo += Utilitaria.custoKmExtra; 
            }
        }

        return custo;
    }

}
