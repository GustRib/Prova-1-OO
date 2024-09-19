//GUSTAVO VIEIRA FERNANDES RIBEIRO
//202165059AB

package br.ufjf.dcc.dcc025.questao1;

/**
 *
 * @author gleiph
 */
import java.util.*;

public class Anagrama {
    public static Map<String, List<String>> agrupaAnagramas(List<String> palavras) {
        Map<String, List<String>> anagramasMap = new HashMap<>();
        for (String palavra : palavras) {
            char[] caracteres = palavra.toCharArray();
            Arrays.sort(caracteres);
            String palavraOrdenada = new String(caracteres);
            
            if (!anagramasMap.containsKey(palavraOrdenada)) {
                anagramasMap.put(palavraOrdenada, new ArrayList<>());
            }
            anagramasMap.get(palavraOrdenada).add(palavra);
        }
        return anagramasMap;
    }

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("amor", "roma", "carro", "arco", "mar", "ramo", "roca");
        Map<String, List<String>> resultado = agrupaAnagramas(palavras);
    
        for (Map.Entry<String, List<String>> entry : resultado.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

