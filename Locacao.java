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
    //gets sets
    public int getLocacaoID(){
        return this.locacaoID;
    }
    public void setLocacaoID(int locacaoID){
        this.locacaoID = locacaoID;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Veiculo getVeiculo(){
        return this.veiculo;
    }
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    public Calendar getDtLocacao(){
        return this.dtDevolucao;
    }
    public void setDtLocacao(Calendar dtLocacao){
        this.dtLocacao = dtLocacao;
    }
    public Calendar getDtDevolucaoPrevista(){
        return this.dtDevolucaoPrevista;
    }
    public void setDtDevolucaoPrevista(Calendar dtDevolucaoPrevista){
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
    }
    public Calendar getDtDevolucao(){
        return this.dtDevolucao;
    }
    public void setDtDevolucao(Calendar dtDevolucao){
        this.dtDevolucao = dtDevolucao;
    }
    public long getKmLocacao(){
        return this.kmLocacao;
    }
    public void setKmLocacao(long kmLocacao){
        this.kmLocacao = kmLocacao;
    }
    public long getKmDevolucao(){
        return this.kmDevolucao;
    }
    public void setKmDevolucao(long kmDevolucao){
        this.kmDevolucao = kmDevolucao;
    }
    public double getValorCaucao(){
        return this.valorCaucao;
    }
    public void setValorCaucao(double valorCaucao){
        this.valorCaucao = valorCaucao;
    }
    public double getValorLocacao(){
        return this.valorLocacao;
    }
    public void setValorLocacao(double valorLocacao){
        this.valorLocacao = valorLocacao;
    }
    public boolean getPaga(){
        return this.paga;
    }
    public void setPaga(boolean paga){
        this.paga = paga;
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
