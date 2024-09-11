
import java.util.Locale;
import java.util.Scanner;

public class ex3aula4 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int i;
        double somaTotal=0;
        double precoTotal=0;
        

        String[] nomes = new String[5];

        for(i = 0; i < 5; i++){

            System.out.println("Informe o nome do produto"+(i+1)+":");
            nomes[i] = sc.nextLine();

            System.out.println("Informe a quantidade:");
            double quantidade = Double.parseDouble(sc.nextLine());

            System.out.println("Informe o preço unitário:");
            double precoUnitario = Double.parseDouble(sc.nextLine());

            
            precoTotal = precoUnitario * quantidade;
            somaTotal += precoTotal;

            System.out.println("Preço total do produto:"+precoTotal);
            
        }

        System.out.println("Soma total dos produtos = "+somaTotal);
        System.out.println("Nome produto 1:"+nomes[0]);
        System.out.println("Nome produto 2:"+nomes[1]);
        System.out.println("Nome produto 3:"+nomes[2]);
        System.out.println("Nome produto 4:"+nomes[3]);
        System.out.println("Nome produto 5:"+nomes[4]);
        

        sc.close();


    }
    
}
