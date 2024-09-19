package br.ufjf.dcc.dcc025.questao1;
//GUSTAVO VIEIRA FERNANDES RIBEIRO
//202165059AB
import java.util.Arrays;

public class Palavra {

    public static String convertePalavra(String palavra) {
        if (palavra == null || palavra.isEmpty()) {
            return palavra;
        }
        String palavraMinuscula = palavra.toLowerCase();
        char[] caracteres = palavraMinuscula.toCharArray();
        Arrays.sort(caracteres);
        return new String(caracteres);
    }

    public static void main(String[] args) {
        String palavra = "AMOR";
        String palavraConvertida = convertePalavra(palavra);
        System.out.println(palavraConvertida);  
    }
}

