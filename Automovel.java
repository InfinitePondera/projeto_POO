package projetofinal;

import java.util.Scanner;

public class Automovel extends Veiculo {
    //

    public Automovel(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria) {
        super(placa, cor, nroPortas, combtipo, km, valorDiaria);
    }

    public static Automovel criar() {
        Scanner entrada = new Scanner(System.in);
        String placa;
        String cor;
        int nroPortas;
        char combtipo;
        long km;
        double valorDiaria;

        placa = leitura.lerString;
        cor = leitura.lerString;
        nroPortas = leitura.lerInt;
        combtipo = entrada.next().charAt(0);
        km = entrada.nextLong();
        valorDiaria = leitura.lerDouble;

        Automovel auto = new Automovel(placa, cor, nroPortas, combtipo, km, valorDiaria);
        return auto;
    }

    public String toString() {
        return super.getVeiculoID() + "|" + super.getPlaca() + "|" + super.getCor() + "|" + super.getNroPortas() + "|"
                + super.getTipoCombustivel + "|" + super.getQuilometragem + "|" + super.getValorDiaria;
    }
}
