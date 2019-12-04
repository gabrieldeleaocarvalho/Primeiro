package aula;
import java.util.ArrayList;
import java.util.List;

public class Aula
{
    class Licao
    {        
    }
    
    private int x;
    private int y;

    public static void main(String[] args)
    {
        int numero = 0;
        List<Integer> lista = new ArrayList<>();
        lista.add(numero);
        if(numero < 5) {
            System.out.println("Menor que 5");
        } else {
            System.out.println("Maior que 5");
        }        
        while(numero < 5) {
            numero++;
        }
        Exemplo ex = new Exemplo(30, 60);
        System.out.println(lista + " " + numero + "\n" + ex );        
    }
    
    public int calculaNumero(int param)
    {
        return param + 10;       
}
}