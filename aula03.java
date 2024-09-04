
import java.util.Scanner;

public class aula03 {



/*
 * Exercicio : ler 5 nomes e apresentar na tela
 */

    public static void main(String []args){


        Scanner sc = new Scanner(System.in);

       // String func1,func2,func3,func4,func5;

        for(int i=1;i<=6;i++){

            System.out.print("Digite o nome do funcionário " +i+ ":");
            String nomes = sc.nextLine();

            System.out.println(nomes);

        }

      /*   System.out.print("Digite o nome do funcionário 1: ");
        func1 = sc.nextLine();

        System.out.print("Digite o nome do funcionário 2: ");
        func2 = sc.nextLine();

        System.out.print("Digite o nome do funcionário 3: ");
        func3 = sc.nextLine();

        System.out.print("Digite o nome do funcionário 4: ");
        func4 = sc.nextLine();

        System.out.print("Digite o nome do funcionário 5: ");
        func5 = sc.nextLine();

        System.out.println("\n"+func1+"\n"+func2+"\n"+func3+"\n"+func4+"\n"+func5);
*/
        
        sc.close();



    }
    
}
