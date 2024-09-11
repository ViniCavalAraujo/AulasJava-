
import java.util.Scanner;
import java.util.Locale;
public class ex1aula4 {
    
    public static void main(String []args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String nome;
        double media=0 ;
        double somaNotas=0;
        int i;
        //double nota=0;
        System.out.println("Aluno(a) informe seu nome: ");
        nome = sc.nextLine();

        for( i = 0;i<5;i++){
            System.out.println("Informe a nota"+ i);
             double nota = Double.parseDouble(sc.nextLine());
            somaNotas += nota;

             //media = nota / 5;


        }

        media = somaNotas / i;
        System.out.println("Aluno" + nome+ "com média:" +media);

       
    sc.close();

    }

    
}
