package projetofinal;

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

    //construtores

    //gets-sets

    //metodos

    public static Locacao cria()
    {
        Locacao loc = new Locacao();
        return loc;
    }

    public static void listar(Locacao[] listLoc)
    {
        
    }
    public double calculaLocacao()
    {
        
    }
    public boolean pagar()
    {

    }



}