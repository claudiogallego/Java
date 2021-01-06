import java.util.Scanner;

public class Uri1070{
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        int num = teclado.nextInt();

        for (int i = 1; i<12; i=i +2){
            System.out.println(num+i);
        }
    }
}