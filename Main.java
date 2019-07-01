package projetofinal;

public class Main{
	public static void main(String[] args) {
		int menu;
		do {
        System.out.println("----== LOCADORA -DE- AUTOMOVEIS ==----");
        int Ctipo, Vtipo;
        int Lcount;
        int cont = 0;
        Locacao[] loc = new Locacao[99];

        System.out.printf("\n1 -- Realizar uma nova Locação ------\n");
        System.out.printf("\n2 -- Realizar varias Locações -------\b");
        System.out.printf("\n3 -- Realizar cadastro de Cliente ---\n");
        System.out.printf("\n4 -- Realizar cadastro de Veiculos --\n");
        System.out.printf("\n5 -- Listar Locações ----------------\n");
        menu = Leitura.lerInt();

        switch (menu) {
            case 1:
            	loc [cont] = Locacao.criar();
            	cont++;
                break;

            case 2:

                System.out.println("Digite a quantidade de locaﾃｧﾃｵes que deseja cadastrar");
                Lcount = Leitura.lerInt();
                
                loc = new Locacao[Lcount];

                for(int i = 0; i< Lcount;i++)
                {
                    loc[i].criar();
                }
                break;

            case 3:
                System.out.printf("\n - Digite o tipo de cliente a ser cadastrado:\n");
                Ctipo = Leitura.lerInt();
                    switch(Ctipo)
                    {
                        case 1:
                            ClientePF.criar();
                            break;
                        case 2:
                            ClientePJ.criar();
                            break;
                    }
                break;      
            
            case 4:
                System.out.printf("\n - Digite o tipo de carro desejado:\n");
		        System.out.printf("1 para Utilitario\n");
		        System.out.printf("2 para Onibus\n");
		        System.out.printf("3 para Automovel\n");
                System.out.printf("4 para Executivo\n");
                Vtipo = Leitura.lerInt();
                    switch(Vtipo)
                    {
                        case 1:
                            Utilitario.criar();
                            break;
                        case 2:
                            Onibus.criar();
                            break;
                        case 3:
                            Automovel.criar();
                            break;
                        case 4:
                            Executivo.criar();
                            break;
                    }
                break;
            case 5:
                
                Locacao.listar(loc);
                    
                break;
        }
	}while(menu != 0);
	}
}
