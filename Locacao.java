package projetofinal;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Locacao
{
    //atributos
    private int locacaoID;
    private Cliente cliente;
    private Veiculo veiculo;
    private Calendar dtLocacao;
    private Calendar dtDevolucaoPrevista;
    private Calendar dtDevolucao;
    private Long kmLocacao;
    private Long kmDevolucao;
    private double valorCaucao;
    private double valorLocacao;
    private boolean paga; 

    //construtor
    public Locacao(int locId, Cliente client, Veiculo veic, Calendar dtsaida, Calendar dtvoltaprev, Calendar dtvolta, Long kmsaida, Long kmvolta, double vlcaucao, double vlloc, boolean pg)
    {
        locacaoID = locId;
        cliente = client;
        veiculo = veic;
        dtLocacao = dtsaida; 
        dtDevolucaoPrevista = dtvoltaprev;
        dtDevolucao = dtvolta;
        kmLocacao = kmsaida;
        kmDevolucao = kmvolta;
        valorCaucao = vlcaucao;
        valorLocacao = vlloc;
        paga = pg;
    }

    //metodos

    public static Locacao cria()
    {
        Locacao loc = new Locacao();
        return loc;
    }

    public static void listar(Locacao[] listLoc)
    {
        for(int i = 0; i < listLoc.length; i++)
        {
            System.out.println(listLoc[i]);
        }
    }
    public double calculaLocacao()
    {
        int dias;
        double custo;
        long km;
        dias = ChronoUnit.DAYS.between(dtLocacao.toInstant(), dtDevolucao.toInstant());
        km = kmDevolucao - kmLocacao;        

        custo = veiculo.calculaCustos(dias,km) + valorLocacao + valorCaucao;    
        
        return custo;
    }
    public boolean pagar()
    {
        if(paga == false)
        {
            paga = true;
            return paga;
        }
        else
        {
            return paga;
        }
    }



}
