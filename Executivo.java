package projetofinal;
import java.util.Scanner;
public class Executivo extends Automovel {

    private double vlOpcionais;

    //
    public double getVlOpcionais() {
        return this.vlOpcionais;
    }

    public void setVlOpcionais(double vlOpcionais) {
        this.vlOpcionais = vlOpcionais;
    }

    //
    public Executivo(String placa, String cor, int nroPortas, char combtipo, long km, double valorDiaria,
            double vlopc) {
        super(placa, cor, nroPortas, combtipo, km, valorDiaria);
        this.vlOpcionais = vlopc;
    }

    public static Executivo criar() {
        String placa;
        String cor;
        int nroPortas;
        char combtipo;
        long km;
        double valorDiaria;
        double vlopc;

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n Digite o numero da placa: ");
        placa = Leitura.lerString();
        System.out.println("\n Digite a cor do carro: ");
        cor = Leitura.lerString();
        System.out.println("\n Digite o numero de portas: ");
        nroPortas = Leitura.lerInt();
        System.out.println("\n Digite o tipo de combustível(G, A, ou D): ");
        combtipo = entrada.next().charAt(0);
        System.out.println("\n Digite a quilometragem do carro: ");
        km = entrada.nextLong();
        System.out.println("\n Digite o valor da diária: ");
        valorDiaria = Leitura.lerDouble();
        System.out.println("\n Digite o valor dos opcionais: ");
        vlopc = Leitura.lerDouble();
        Executivo exec = new Executivo(placa, cor, nroPortas, combtipo, km, valorDiaria, vlopc);
        return exec;
    }

    public double calculaCustos(int dias, long km) {
        double custo;

        custo = (super.getValorDiaria() * dias) + vlOpcionais;

        return custo;
    }

    public String toString() {
        return this.vlOpcionais + "|";
    }
}
