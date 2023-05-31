import java.util.Random;

public class Atividade2 {
    public static void main(String[] args) {
        int min = 1;
        int max = 60;
        Random rand = new Random();
        ListaDupla lista = new ListaDupla();

        for(int i = 0; i < 5100000; i++){
            int numero = rand.nextInt((max - min) + 1) + min;
            System.out.println((i + 1) + " : " + numero);
            lista.inserirFim(numero); 
        }

        int qtdSequencias = 0;
        for(int i = 0; i < 5100000; i++){
            if(lista.get(i).equals(1) && lista.get(i + 1).equals(15) && lista.get(i + 2).equals(16) && lista.get(i + 3).equals(25) && lista.get(i + 4).equals(32) && lista.get(i + 5).equals(36)){
                System.out.println(i + ": 1");
                System.out.println((i + 1) + ": 15");
                System.out.println((i + 2) + ": 16");
                System.out.println((i + 3) + ": 25");
                System.out.println((i + 4) + ": 32");
                System.out.println((i + 5) + ": 36");
                qtdSequencias++;
            }
        }
        System.out.println("A QUANTIDADE DE SEQUENCIAS FOI DE: " + qtdSequencias);

        qtdSequencias = 0;
        for(int i = 5100000; i > 0; i--){
            if(lista.get(i).equals(1) && lista.get(i - 1).equals(15) && lista.get(i - 2).equals(16) && lista.get(i - 3).equals(25) && lista.get(i - 4).equals(32) && lista.get(i - 5).equals(36)){
                System.out.println(i + ": 1");
                System.out.println((i - 1) + ": 15");
                System.out.println((i - 2) + ": 16");
                System.out.println((i - 3) + ": 25");
                System.out.println((i - 4) + ": 32");
                System.out.println((i - 5) + ": 36");
                
                qtdSequencias++;
            }
        }
        System.out.println("A QUANTIDADE DE SEQUENCIAS NA INVERSA FOI DE: " + qtdSequencias);
    }
}
