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
        
        System.out.println("\n Digite o numero da placa: ");
        placa = Leitura.lerString();
        System.out.println("\n Digite a cor do carro: ");
        cor = Leitura.lerString();
        System.out.println("\n Digite o numero de portas: ");
        nroPortas = Leitura.lerInt();
        System.out.println("\n Digite o tipo de combustível(G, A, ou D): ");
        combtipo = entrada.next().charAt(0);
        System.out.println("\n Digite a quilometragem: ");
        km = entrada.nextLong();
        System.out.println("\n Digite o valor da diária: ");
        valorDiaria = Leitura.lerDouble();
        System.out.println("\n Digite a capacidade de carga: ");
        capCarga = Leitura.lerInt();
        System.out.println("\n Digite o numero de eixos: ");
        nEixos = Leitura.lerInt();

        Utilitario util = new Utilitario(placa, cor, nroPortas, combtipo, km, valorDiaria, capCarga, nEixos);
        return util;
    }

    public String toString() {
        return this.capacidadeCarga + "|" + this.nroEixos;
    }
}
