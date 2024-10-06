import java.util.Scanner;


public class RegistroProdutos {


    
    public String nome;
    public Double preco;
    public Double quantidade;

    /*
     * Desenvolva uma classe em Java chamada RegistroProdutos para armazenar informações de 10 produtos. Cada produto deve conter nome (String), preço (double) e quantidade (int). Implemente um método para calcular e retornar a quantidade total de produtos registrados.

     */
    //construtor
    public RegistroProdutos(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        this.nome = sc.nextLine();
        System.out.println("Digite o valor do produto:");
        this.preco = sc.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        this.quantidade = sc.nextDouble();
        
    }

    public double calculo(){
        return this.preco * this.quantidade;
    }
    

}
