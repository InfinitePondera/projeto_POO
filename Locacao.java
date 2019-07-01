package projetofinal;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Locacao {
    // atributos
    private int locacaoID;
    private Cliente cliente;
    private Veiculo veiculo;
    private Calendar dtLocacao;
    private Calendar dtDevolucaoPrevista;
    private Calendar dtDevolucao;
    private long kmLocacao;
    private long kmDevolucao;
    private double valorCaucao;
    private double valorLocacao;
    private boolean paga;

    // construtor
    public Locacao(Cliente client, Veiculo veic, Calendar dtsaida, Calendar dtvoltaprev, Calendar dtvolta,
            Long kmsaida, Long kmvolta, double vlcaucao, double vlloc) {
        this.locacaoID = Utilitaria.IdLocacao;
        Utilitaria.IdLocacao++;
        this.cliente = client;
        this.veiculo = veic;
        this.dtLocacao = dtsaida;
        this.dtDevolucaoPrevista = dtvoltaprev;
        this.dtDevolucao = dtvolta;
        this.kmLocacao = kmsaida;
        this.kmDevolucao = kmvolta;
        this.valorCaucao = vlcaucao;
        this.valorLocacao = vlloc;
    }

    // gets sets
    public int getLocacaoID() {
        return this.locacaoID;
    }

    public void setLocacaoID(int locacaoID) {
        this.locacaoID = locacaoID;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Calendar getDtLocacao() {
        return this.dtDevolucao;
    }

    public void setDtLocacao(Calendar dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    public Calendar getDtDevolucaoPrevista() {
        return this.dtDevolucaoPrevista;
    }

    public void setDtDevolucaoPrevista(Calendar dtDevolucaoPrevista) {
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
    }

    public Calendar getDtDevolucao() {
        return this.dtDevolucao;
    }

    public void setDtDevolucao(Calendar dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public long getKmLocacao() {
        return this.kmLocacao;
    }

    public void setKmLocacao(long kmLocacao) {
        this.kmLocacao = kmLocacao;
    }

    public long getKmDevolucao() {
        return this.kmDevolucao;
    }

    public void setKmDevolucao(long kmDevolucao) {
        this.kmDevolucao = kmDevolucao;
    }

    public double getValorCaucao() {
        return this.valorCaucao;
    }

    public void setValorCaucao(double valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public double getValorLocacao() {
        return this.valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean getPaga() {
        return this.paga;
    }

    public void setPaga(boolean paga) {
        this.paga = false;
    }
    // metodos

    public static Locacao criar() {
        Cliente client;
        Veiculo veic;
        Calendar dtsaida;
        Calendar dtvoltaprev;
        Calendar dtvolta;
        Long kmsaida;
        Long kmvolta;
        double vlcaucao;
        double vlloc;
        int C;

        Scanner ler = new Scanner(System.in);

        System.out.printf("\n - Digite o tipo de cliente a ser cadastrado:\n");

        C = Leitura.lerInt();

        switch (C) {
        case 1:
            client = ClientePF.criar();
            break;
        case 2:
            client = ClientePJ.criar();

        }
        ;
        System.out.printf("\n - Digite o tipo de carro desejado:\n");
        System.out.printf("1 para Utilitario\n");
        System.out.printf("2 para Onibus\n");
        System.out.printf("3 para Automovel\n");
        System.out.printf("4 para Executivo\n");

        int tipo = Leitura.lerInt();

        switch (tipo) {
        case 1:
            veic = Utilitario.criar();
            break;
        case 2:
            veic = Onibus.criar();
            break;
        case 3:
            veic = Automovel.criar();
            break;
        case 4:
            veic = Executivo.criar();
        }

        dtsaida = Calendar.getInstance();
        //------------------
        String dtPrev = Leitura.lerString();

        int dia, mes, ano;

        dia = Integer.parseInt(dtPrev.substring(0,3));
        mes = Integer.parseInt(dtPrev.substring(3, 5));
        ano = Integer.parseInt(dtPrev.substring(5));

        dtvoltaprev = Calendar.getInstance();

        dtvoltaprev.set(Calendar.DAY_OF_MONTH, dia);

        switch(mes)
        {
            case 01:
                dtvoltaprev.set(Calendar.MONTH, Calendar.JANUARY);
                break;
            case 02:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.FEBRUARY);
                break;
            case 03:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.MARCH);
                break;
            case 04:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.APRIL);
                break;
            case 05:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.MAY);
                break;
            case 06:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.JUNE);
                break;
            case 07:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.JULY);
                break;
            case 010:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.AUGUST);
                break;
            case 011:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.SEPTEMBER);
                break;
            case 10:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.OCTOBER);
                break;
            case 11:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.NOVEMBER);
                break;
            case 12:
            	dtvoltaprev.set(Calendar.MONTH, Calendar.DECEMBER);
                break;
        }
        //--------------
        dtvolta = Calendar.getInstance();
        kmsaida = ler.nextLong();
        kmvolta = ler.nextLong();
        vlcaucao = Leitura.lerDouble();
        vlloc = Leitura.lerDouble();
        client = new Cliente("", null);
        veic = new Veiculo("", "", 0, ' ', 0, 0);
        
        Locacao loc = new Locacao(client, veic, dtsaida, dtvoltaprev, dtvolta, kmsaida, kmvolta, vlcaucao,
                vlloc);
        return loc;
    }

    public static void listar(Locacao[] listLoc) {
        for (int i = 0; i < listLoc.length; i++) {
            System.out.println(listLoc[i].toString() + "\n\n");
        }
    }

    public double calculaLocacao() {
        int dias;
        double custo;
        long km;
        dias = (int) ChronoUnit.DAYS.between(dtLocacao.toInstant(), dtDevolucao.toInstant());
        km = kmDevolucao - kmLocacao;

        custo = veiculo.calculaCustos(dias, km) + valorLocacao + valorCaucao;

        return custo;
    }

    public boolean pagar() {
        if (paga == false) {
            paga = true;
            return paga;
        } else {
            return paga;
        }
    }

    public String toString() {
        return this.locacaoID + "|" + this.cliente + "|" + this.veiculo + "|" + this.dtLocacao + "|"
                + this.dtDevolucaoPrevista + "|" + this.dtDevolucao + "|" + this.kmLocacao + "|" + this.kmDevolucao
                + "|" + this.valorCaucao + "|" + this.valorLocacao + "|" + this.paga;
    }

}
