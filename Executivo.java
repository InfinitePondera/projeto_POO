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
        placa = Leitura.lerString();
        cor = Leitura.lerString();
        nroPortas = Leitura.lerInt();
        combtipo = entrada.next().charAt(0);
        km = entrada.nextLong();
        valorDiaria = Leitura.lerDouble();
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
