package projetofinal;

public class Utilitario extends Veiculo
{
     private int capacidadeCarga;
     private int nroEixos;

     //

     public Utilitario(String placa, string cor, int nroPortas, char combtipo, long km, double valorDiaria, int capCarga, int nEixos)
     {
        super(placa,cor,nroPortas, combtipo, km, valorDiaria)
        this.capacidadeCarga = capCarga;
        this.nroEixos = nEixos;       
     }

     public static Utilitario criar()
     {
         Utilitario util = new Utilitario();
     }
}
