
import java.util.Scanner;

public class e{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String cidade[] = {"Osasco", "Carapicuiba","Gramado","Coritiba"}; 

        System.out.print("Digite um estado:");
        String estado = sc.nextLine();



      
        switch(estado){

            case "São Paulo":
                System.out.println(cidade[0]+" "+cidade[1]);
                break;
            case "Rio Grande do Sul":
                System.out.println(cidade[2]);
                break;
            case "Paraná":
                System.out.println(cidade[3]);
                break;
            default:
                System.out.println("Estado inválido");
                break;

        }
    
        
        



    }
}