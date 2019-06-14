package projetofinal;

public class Utilitario extends Veiculo
{
     private int capacidadeCarga;
     private int nroEixos;

     //

     public Utilitario(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria, int capCarga, int nEixos)
     {
        super(placa,cor,nroPortas, combtipo, km, valorDiaria);
        this.capacidadeCarga = capCarga;
        this.nroEixos = nEixos;       
     }
     //
     public int getCapacidadeCarga(){
         return this.capacidadeCarga;
     }
     public void setCapacidadeCarga(int capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
     }
     public int getNroEixos(){
         return this.nroEixos;
     }
     public void setNroEixos(int nroEixos){
         this.nroEixos = nroEixos;
     }
     //
     public static Utilitario criar(String placa, string cor, int nroPortas, char combtipo, long km, double valorDiaria, int capCarga, int nEixos)
     {
         Utilitario util = new Utilitario(placa, cor, nroPortas, combtipo, km, valorDiaria, capCarga, nEixos);
         return util;
     }
}
