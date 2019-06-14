package projetofinal;

public class Automovel extends Veiculo
{
    //

    public Automovel(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria)
    {
        super(placa, cor, nroPortas, combtipo, km, valorDiaria);
    }

    public static Automovel criar(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria)
    {
        Automovel auto = new Automovel(placa, cor, nroPortas, combtipo, km, valorDiaria);
        return auto;
    }
}
