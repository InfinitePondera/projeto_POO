package projetofinal;

import java.util.Scanner;

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

        placa = Leitura.lerString();
        cor = Leitura.lerString();
        nroPortas = Leitura.lerInt();
        combtipo = entrada.next().charAt(0);
        km = entrada.nextLong();
        valorDiaria = Leitura.lerDouble();
        capCarga = Leitura.lerInt();
        nEixos = Leitura.lerInt();

        Utilitario util = new Utilitario(placa, cor, nroPortas, combtipo, km, valorDiaria, capCarga, nEixos);
        return util;
    }

    public String toString() {
        return this.capacidadeCarga + "|" + this.nroEixos;
    }
}
