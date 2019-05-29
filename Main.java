package Poo1;

public class Main {
    public static void main(String[] args) {
        Pessoa qqrcoisa = new Pessoa("Jonas Marcelo", "69881347866", "911", Endereco.cria());

        Utilitario.validarCep(qqrcoisa.getEndereco().getCEP());
        Utilitario.validarEstado(qqrcoisa.getEndereco().getEstado());
        Utilitario.validarCpf(qqrcoisa.getCPF());         

        System.out.println(qqrcoisa.getNome());
        System.out.println(qqrcoisa.getCPF());
        System.out.println(qqrcoisa.getFone());
        System.out.println(qqrcoisa.getEndereco());
        System.out.printf("%s\n", qqrcoisa.getEndereco().toString());
    }
}