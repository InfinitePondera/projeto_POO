
package projetofinal;

import java.util.Scanner;

public class Onibus extends Veiculo {
    private int nroPassageiros;
    private double vlSeguroPassageiro;
    private boolean guia;

    //

    public Onibus(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria, int npassag,
            int vlseguro, boolean guia) {
        super(placa, cor, nroPortas, combtipo, km, valorDiaria);
        this.nroPassageiros = npassag;
        this.vlSeguroPassageiro = vlseguro;
        this.guia = guia;
    }

    //
    public int getNroPassageiros() {
        return this.nroPassageiros;
    }

    public void setNroPassageiros(int nroPassageiros) {
        this.nroPassageiros = nroPassageiros;
    }

    public double getVlSeguroPassageiro() {
        return this.vlSeguroPassageiro;
    }

    public void setVlSeguroPassageiro(double vlSeguroPassageiro) {
        this.vlSeguroPassageiro = vlSeguroPassageiro;
    }

    public boolean getGuia() {
        return this.guia;
    }

    public void setGuia(boolean guia) {
        this.guia = guia;
    }

    //
    public static Onibus criar() {
        String placa;
        String cor;
        int nroPortas;
        char combtipo;
        long km;
        double valorDiaria;
        int npassag;
        int vlseguro;
        boolean guia;

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n Digite o numero da placa: ");
        placa = Leitura.lerString();
        System.out.println("\n Digite a cor do carro: ");
        cor = Leitura.lerString();
        System.out.println("\n Digite o numero de portas: ");
        nroPortas = Leitura.lerInt();
        System.out.println("\n Digite o tipo do combustível(G, A, ou D): ");
        combtipo = entrada.next().charAt(0);
        System.out.println("\n Digite a quilometragem: ");
        km = entrada.nextLong();
        System.out.println("\n Digite o valor da diária: ");
        valorDiaria = Leitura.lerDouble();
        System.out.println("\n Digite o numero de passageiros: ");
        npassag = Leitura.lerInt();
        System.out.println("\n Digite o valor do seguro: ");
        vlseguro = Leitura.lerInt();
        guia = true;

        Onibus onibus = new Onibus(placa, cor, nroPortas, combtipo, km, valorDiaria, npassag, vlseguro, guia);
        return onibus;
    }

    public double calculaCustos(int dias, long km) {
        double custo;
        int diferenca;

        diferenca = (int) (km - (dias * 100));
        custo = super.getValorDiaria() * dias;

        if (diferenca > 0) {
            for (int i = 0; i < diferenca; i++) {
                custo += Utilitaria.custoKmExtra;
            }
        }

        custo = vlSeguroPassageiro * nroPassageiros;
        custo = Utilitaria.custoGuia * dias;

        return custo;
    }

    public String toString() {
        return this.nroPassageiros + "|" + this.vlSeguroPassageiro + "|" + this.guia;
    }
}
