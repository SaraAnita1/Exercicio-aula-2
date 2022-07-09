/**
 * Classe de exemplo para o exercício da Aula 2 de variáveis, Tipos de Dado e operadores aritméticos.
 */

 public class Main {

    public static  void main(String [] args) {
        //formas corretas de escrever e algumas formas erradas e o porque
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; (o tamanho dele ultrapassa muito o valor comportado por um short)

        //int i1 = -10000000000; (valor está muito além do valor negativo que um int pode suportar)
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5;
        float f2 = 10.68F;

        double d1 = 85.86;
        double d2 = 99.04d;

        char c1 = 'W';
        // char c2 = 'Tw'; char só aceita um caracter por vez
        char c3 = '\u0057'; //unicode do caractere W.

        String st1 = "Fulano";
        String st2 = "Sicrano";
        String st3 = "ag dgb se at KNBJB JBB &*&%& 75894389";

        //String dt1 = "20/05/1997";

        boolean bo1 = true;
        boolean bo2 = false;

        //Resultados

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

    }

 }