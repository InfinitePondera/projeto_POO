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
        Scanner entrada = new Scanner(System.in);
        placa = leitura.lerString;
        cor = leitura.lerString;
        nroPortas = leitura.lerInt;
        combtipo = entrada.next().charAt(0);
        long = entrada.nextLong();
        valorDiaria = leitura.lerDouble;
        vlopc = leitura.lerDouble;
        Executivo exec = new Executivo(placa, cor, nroPortas, combtipo, km, valorDiaria,vlpopc);
        return exec;
    }

    public double calculaCustos(int dias, long km)
    {
        double custo;

        custo = (valorDiaria * dias) + vlOpcionais;

        return custo;
    }
}
