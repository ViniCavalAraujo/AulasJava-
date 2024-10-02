import java.util.Scanner;

public class timesFutebol {


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String estados[] = {"Estado de São Paulo","Rio de Janeiro","Rio Grande do Sul","Minas Gerais"};

        System.out.println("Informe um time de futebol:");
        String time = sc.nextLine();

        switch(time){
            case "Sao Paulo":
                System.out.println(estados[0]);
                break;
            case "Palmeiras":
                System.out.println(estados[0]);
                break;
            case "Santos":
                System.out.println(estados[0]);
                break;
            case "Corinthians":
                System.out.println(estados[0]);
                break;

            case "Flamengo":
            System.out.println(estados[1]);
            break;
            case "Vasco":
            System.out.println(estados[1]);
            break;
            case "Fluminense":
            System.out.println(estados[1]);
            break;
            case "Botafogo":
            System.out.println(estados[1]);
            break;
            case "Gremio":
            System.out.println(estados[2]);
            break;
            case "Internacional":
            System.out.println(estados[2]);
            break;
            case "Atletico Mineiro":
            System.out.println(estados[3]);
            break;
            case "Cruzeiro":
            System.out.println(estados[3]);
            break;


        }

        sc.close();

    }
    
}
