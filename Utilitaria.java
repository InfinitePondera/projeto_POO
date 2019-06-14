package projetofinal;
import java.util.InputMismatchException;

public class Utilitaria {
    //atributos
    public static double custoKmExtra = 1.20;
    public static double custoGuia = 250.00;
    public static int IdVeiculo;
    public static int IdLocacao;
    //metodos
    public static bool validarCep(String cep) {
        if (cep.Length == 8)
        {
            cep = cep.Substring(0, 5) + "-" + cep.Substring(5, 3);
            //txt.Text = cep;
        }
        return System.Text.RegularExpressions.Regex.IsMatch(cep, ("[0-9]{5}-[0-9]{3}"));
    }

    public static boolean validarCpf(String cpf) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpfPessoa.equals("00000000000") || cpfPessoa.equals("11111111111") || cpfPessoa.equals("22222222222")
                || cpfPessoa.equals("33333333333") || cpfPessoa.equals("44444444444") || cpfPessoa.equals("55555555555")
                || cpfPessoa.equals("66666666666") || cpfPessoa.equals("77777777777") || cpfPessoa.equals("88888888888")
                || cpfPessoa.equals("99999999999") || (cpfPessoa.length() != 11))
            return (false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posicao de '0' na tabela ASCII)
                num = (int) (cpfPessoa.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpfPessoa.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else
                dig11 = (char) (r + 48);

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpfPessoa.charAt(9)) && (dig11 == cpfPessoa.charAt(10)))
                return (true);
            else
                return (false);
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
    public static boolean validarCNPJ(String CNPJ) {
        // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
            if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
                CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
                CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
                CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
                CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
               (CNPJ.length() != 14))
               return(false);
         
            char dig13, dig14;
            int sm, i, r, num, peso;
         
        // "try" - protege o código para eventuais erros de conversao de tipo (int)
            try {
        // Calculo do 1o. Digito Verificador
              sm = 0;
              peso = 2;
              for (i=11; i>=0; i--) {
        // converte o i-ésimo caractere do CNPJ em um número:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posição de '0' na tabela ASCII)
                num = (int)(CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                   peso = 2;
              }
         
              r = sm % 11;
              if ((r == 0) || (r == 1))
                 dig13 = '0';
              else dig13 = (char)((11-r) + 48);
         
        // Calculo do 2o. Digito Verificador
              sm = 0;
              peso = 2;
              for (i=12; i>=0; i--) {
                num = (int)(CNPJ.charAt(i)- 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                   peso = 2;
              }
         
              r = sm % 11;
              if ((r == 0) || (r == 1))
                 dig14 = '0';
              else dig14 = (char)((11-r) + 48);
         
        // Verifica se os dígitos calculados conferem com os dígitos informados.
              if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
                 return(true);
              else return(false);
            } catch (InputMismatchException erro) {
                return(false);
            }
          }

    public static boolean validarEstado(String estado) {
        int i;

        String vet[] = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR",
                "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
        for (i = 0; i < 27; i++) {
            if (estado == vet[i]) {
                return true;
            }
        }
        return false;
    }

}
