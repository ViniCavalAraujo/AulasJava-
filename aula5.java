import java.util.Scanner;
import java.util.Locale;

public class aula5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);

        double somaNota=0;
        double nota=0;


        for(int i = 0;i<=5;i++){
            System.out.println("Informe sua nota:");
            nota = sc.nextDouble();
            somaNota += nota;
        }


        double media = somaNota / 5;
        System.out.println("Média = "+media);



        

        sc.close();
    }


}