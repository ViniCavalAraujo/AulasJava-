import java.util.Random;
import java.util.Scanner;

public class aula4 {

    public static void main(String[] args) {
        

        Random aleatorio = new Random();

        Scanner lendoNumero = new Scanner(System.in);

        final int sorteio = aleatorio.nextInt(10);

        System.out.println("Digite um numero : ");
        int num = lendoNumero.nextInt();

        System.out.println("Numero aleatorio : "+ sorteio + " \nNumero digitado : " + num);
        lendoNumero.close();
    }
    
}
