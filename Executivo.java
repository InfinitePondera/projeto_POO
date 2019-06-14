package projetofinal;

public class Executivo extends Automovel
{
    private double vlOpcionais;
    //
    public double getVlOpcionais(){
        return this.vlOpcionais;
    }
    public void setVlOpcionais(double vlOpcionais){
        this.vlOpcionais = vlOpcionais;
    }
    //
    public Executivo(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria, double vlopc)
    {
        super(placa, cor, nroPortas, combtipo, km, valorDiaria);
        this.vlOpcionais = vlopc;   
    }

    public static Executivo criar(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria, double vlopc)
    {
        Executivo exec = new Executivo(placa, cor, nroPortas, combtipo, km, valorDiaria,vlpopc);
        return exec;
    }
}
