import java.util.Scanner;

public class Uri1001{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int a,b,x;

    //Entrada
    a=teclado.nextInt();
    b=teclado.nextInt();
    
    //Processamento
    x = a + b;

    //Saida
    System.out.println("X = " + x);

    }
}