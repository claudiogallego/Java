import java.util.Scanner;

public class Uri1074{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int N, X;
        N = input.nextInt();

        for (int i = 0; i<N; i++){
            X = input.nextInt();
            if (X==0){
                System.out.print("NULL");
            }
            else{
            if (X%2 ==0) {
                System.out.print("EVEN");
            }
            else
                System.out.print("ODD");
            }  
            if (X>0){
                System.out.print(" POSITIVE");
            }
            else {
                System.out.print(" NEGATIVE");
            }}
        }
    }
