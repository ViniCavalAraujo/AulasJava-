import java.util.Scanner;


public class produtos {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        double qtde=0, unitario=0, total=0;

        System.out.println("Quantidade de produtos:");
        qtde = Double.parseDouble(sc.nextLine());

        System.out.println("Valor unitário:");
        unitario = Double.parseDouble(sc.nextLine());

        total = qtde * unitario;

        System.out.println("Total:"+total);


        sc.close();

    }
    
}
