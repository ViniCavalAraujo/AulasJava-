import java.util.Scanner;


public class RegistroProdutos {


    
    public String nome[] = new String[10];
    public Double preco[] = new Double[10];
    public Double quantidade[] = new Double[10];
    public int i;
    public int registro;

    /*
     * Desenvolva uma classe em Java chamada RegistroProdutos para armazenar informações de 10 produtos. Cada produto deve conter nome (String), preço (double) e quantidade (int). Implemente um método para calcular e retornar a quantidade total de produtos registrados.

     */
    //construtor
    public RegistroProdutos(){

        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++){
        System.out.println("Digite o nome do produto:");
        this.nome[i] = sc.nextLine();
        System.out.println("Digite o valor do produto:");
        this.preco[i] = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a quantidade do produto:");
        this.quantidade[i] = Double.parseDouble(sc.nextLine());
        registro++;

    }
        
    }

    public double calculo(){

        double total=0;

        for(int i=0; i<10;i++){
        total += this.preco[i] * this.quantidade[i];
    }
    return total;
    }

    public int totalRegistro(){

        int total = registro;

        return total;

    }
    



}


 
