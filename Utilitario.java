package projetofinal;

public class Utilitario extends Veiculo {
    private int capacidadeCarga;
    private int nroEixos;

    //

    public Utilitario(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria, int capCarga,
            int nEixos) {
        super(placa, cor, nroPortas, combtipo, km, valorDiaria);
        this.capacidadeCarga = capCarga;
        this.nroEixos = nEixos;
    }

    //
    public int getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getNroEixos() {
        return this.nroEixos;
    }

    public void setNroEixos(int nroEixos) {
        this.nroEixos = nroEixos;
    }

    //
    public static Utilitario criar() {
        Scanner entrada = new Scanner(System.in);
        String placa;
        String cor;
        int nroPortas;
        char combtipo;
        long km;
        double valorDiaria;
        int capCarga;
        int nEixos;

        placa = leitura.lerString;
        cor = leitura.lerString;
        nroPortas = leitura.lerInt;
        combtipo = entrada.next().charAt(0);
        km = entrada.nextLong();
        valorDiaria = leitura.lerDouble;
        capCarga = leitura.lerInt;
        nEixos = leitura.lerInt;

        Utilitario util = new Utilitario(placa, cor, nroPortas, combtipo, km, valorDiaria, capCarga, nEixos);
        return util;
    }

    public String toString() {
        return super.getVeiculoID() + "|" + super.getPlaca() + "|" + super.getCor() + "|" + super.getNroPortas() + "|"
                + super.getTipoCombustivel + "|" + super.getQuilometragem + "|" + super.getValorDiaria + "|"
                + this.capacidadeCarga + "|" + this.nroEixos;
    }
}
