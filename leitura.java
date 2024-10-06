
import java.util.Scanner;

public class leitura {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String nomes[] = new String[30];


        for(int i=0;i<nomes.length;i++){

            System.out.println("Informe o nome:");
            nomes[i] = sc.nextLine();
        }


    }
    
}
