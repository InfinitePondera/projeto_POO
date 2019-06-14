package projetofinal;

public class Onibus extends Veiculo
{
    private int nroPassageiros;
    private double vlSeguroPassageiro;
    private boolean guia;

    //

    public Onibus(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria, int npassag, int vlseguro, boolean guia)
    {
        super(placa, cor, nroPortas, combtipo, km, valorDiaria);
        this.nroPassageiros = npassag;
        this.vlSeguroPassageiro = vlseguro;
        this.guia = guia;
    }

    public static Onibus criar(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria, int npassag, int vlseguro, boolean guia)
    {
        Onibus onibus = new Onibus(placa, cor, nroPortas, combtipo, km, valorDiaria, npassag, vlseguro, guia);
        return onibus;
    }
}
