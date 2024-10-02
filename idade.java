import java.util.Scanner;

public class idade {


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        System.out.println("Informe sua idade:");
        int idade = Integer.parseInt(sc.nextLine());

        if(idade >=60){
            System.out.println("Idoso");
        }else if(idade <18){
            System.out.println("Menor de idade");
        }else if(idade >= 18){
            System.out.println("Maior de idade");
        }

        sc.close();

    }
    
}
