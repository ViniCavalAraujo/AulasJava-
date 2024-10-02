import java.util.Scanner;

public class somaInfinita {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double valor = 1;

        double soma=0;

        while(valor!=0){

            System.out.println("Insira um valor:");
            valor = Double.parseDouble(sc.nextLine());
            soma += valor;
            System.out.println("Valor atual:"+soma);

        }

        sc.close();

    }
    
}
