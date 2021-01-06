import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int idadeEmDias, qtdAnos, qtdMeses, qtdDias, resto;
    
    //Entrada
    idadeEmDias = teclado.nextInt();

    //processamento
    qtdAnos = idadeEmDias / 365;
    resto = idadeEmDias % 365;

    qtdMeses = resto / 30;
    qtdDias = resto % 30;

    //saida
    System.out.println(qtdAnos + " ano(s)");
    System.out.println(qtdMeses + " mes(es)");
    System.out.println(qtdDias + " dia(s)");

    System.out.println();
    }
}


