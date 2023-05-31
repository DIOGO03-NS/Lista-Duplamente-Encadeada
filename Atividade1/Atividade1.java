import java.util.Random;

public class Atividade1 {
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }

    public static void main(String[] args) {
        int vetor[] = new int[1000];
        int min = -9999;
        int max = 9999;
        Random rand = new Random();

        for(int i = 0; i < 1000; i++){
            int numero = rand.nextInt((max - min) + 1) + min;
            System.out.println((i + 1) + " : " + numero);
            vetor[i] = numero;
        }

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        for(int i = 0; i < 1000; i++){
            int elemento = vetor[i];
            int j = 0;
            while(j<lista.tamanho() && (int) lista.Pega(j) < elemento ){
                j++;
            }
            lista.Adiciona(j, elemento);
        }

        
        Celula celula = lista.Primeira;/*
        for(int i = 0; i < vetor.length; i++){
            System.out.println(celula.Elemento); 
            celula = celula.Proxima;
        }*/
        lista.inverterLista();
        
        celula = lista.Primeira;
        for(int i = 0; i < vetor.length; i++){
            System.out.println(celula.Elemento); 
            celula = celula.Proxima;
            lista.imprimir();
        }
        
         
        celula = lista.Primeira;
        for(int i = 0; i < 1000; i++){
            if(ehPrimo((int)celula.Elemento)){
                lista.Remove(i);
                celula =  celula.Proxima;
            }
        }
        
        lista.inverterLista();
        int elementos = lista.TotalDeElementos;

        System.out.println(elementos);
        celula = lista.Primeira;
        for(int i = 0; i < lista.TotalDeElementos; i++){
            System.out.println(celula.Elemento); 
            celula = celula.Proxima;
            lista.imprimir();
        }
    }
}
