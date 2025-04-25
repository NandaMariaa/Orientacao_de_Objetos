import java.util.ArrayList;
 
public class Teste {
    public static void main(String args[]) {
        var listaDeCachorros = new ArrayList<Cachorro>();
 
        for(int i = 0; i < listaDeCachorros.size(); i++) {
            listaDeCachorros.add(new Cachorro(RacasDeCachorro.VIRA_LATA, String.valueOf(Math.random()), (byte)(Math.random() * 20)));
        }
 
        System.out.println("#####");
        for(Cachorro c : listaDeCachorros) {
            System.err.println(c);
        }
    }
}