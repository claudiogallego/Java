import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        
        int hora_start = teclado.nextInt();
        int minutos_start = teclado.nextInt();
        int todos_minutos_start = hora_start * 60 + minutos_start;

        int hora_fim = teclado.nextInt();
        int minutos_fim = teclado.nextInt();
        int todos_minutos_end = hora_fim * 60 + minutos_start;

        int todos_minutos_dif = (24 *60 - todos_minutos_start) + todos_minutos_end;

        int horas = todos_minutos_dif / 60;
        int minutos = todos_minutos_dif % 60;

        if (horas >24 && minutos >=1){
            horas = horas % 24;

        };

        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTOR(S)\n", horas, minutos);
    }
}