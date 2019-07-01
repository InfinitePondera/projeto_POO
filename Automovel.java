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
        
        System.out.println("\n Digite o numero da placa: ");
        placa = Leitura.lerString();
        System.out.println("\n Digite a cor do carro: ");
        cor = Leitura.lerString();
        System.out.println("\n Digite o numero de portas: ");
        nroPortas = Leitura.lerInt();
        System.out.println("\n Digite o tipo do combustível(G, A, D): ");
        combtipo = entrada.next().charAt(0);
        System.out.println("\n Digite a quilometragem: ");
        km = entrada.nextLong();
        System.out.println("\n Digite o valor da diária: ");
        valorDiaria = Leitura.lerDouble();

        Automovel auto = new Automovel(placa, cor, nroPortas, combtipo, km, valorDiaria);
        return auto;
    }
}
