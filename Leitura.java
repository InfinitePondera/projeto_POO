package projetofinal;

import java.io.*;

public class Leitura {
    
    //metodos
    public static String lerString(String label) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader ler = new BufferedReader(input);
        String X = "";
        System.out.print(label);
        try {
            X = ler.readLine();
        } catch (IOException erro) {
            System.out.println("Campo invalido!!");
        }
        return X;
    }

    public static String lerString() {
        return lerString("");
    }

    public static int lerInt() {
        return Integer.parseInt(lerString());
    }

    public static double lerDouble() {
        return Double.parseDouble(lerString());
    }
}
