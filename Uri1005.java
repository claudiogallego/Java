import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        double A,B,MEDIA;

        //Entrada
        A = teclado.nextFloat();
        B = teclado.nextFloat();

        //Processamento
        MEDIA = (A*3.5)+(B*7.5)/11;

        //Saida
        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }
}