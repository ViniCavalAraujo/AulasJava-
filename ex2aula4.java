
import java.util.Scanner;

public class ex2aula4 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int i;
        double soma=0;
        

        String[] nomes = new String[5];

        for(i = 0; i < 5; i++){

            System.out.println("Informe o nome"+(i+1)+":");
            nomes[i] = sc.nextLine();

            System.out.println("Informe a media:");
            double media = Double.parseDouble(sc.nextLine());
            soma += media;

        }

        System.out.println("Soma total das médias = "+soma);
        System.out.println("Nome1:"+nomes[0]);
        System.out.println("Nome2:"+nomes[1]);
        System.out.println("Nome3:"+nomes[2]);
        System.out.println("Nome4:"+nomes[3]);
        System.out.println("Nome5:"+nomes[4]);
        sc.close();


    }
    
}
