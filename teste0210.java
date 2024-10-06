import java.util.Scanner;


public class teste0210 {


    
    public String nome[] = new String[3];
    public Double preco[] = new Double[3];
    public Double quantidade[] = new Double[3];
    public int i;

    /*
     * Desenvolva uma classe em Java chamada RegistroProdutos para armazenar informações de 10 produtos. Cada produto deve conter nome (String), preço (double) e quantidade (int). Implemente um método para calcular e retornar a quantidade total de produtos registrados.

     */
    //construtor
    public teste0210(){

        Scanner sc = new Scanner(System.in);
        for(i=0;i<3;i++){
        System.out.println("Digite o nome do produto:");
        this.nome[i] = sc.nextLine();
        System.out.println("Digite o valor do produto:");
        this.preco[i] = sc.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        this.quantidade[i] = sc.nextDouble();
    }
        
    }

    public double calculo(){
        return this.preco[i] * this.quantidade[i];
    }
    



}


/*public class RegistroProdutos2 {

    public static void main(String[] args) {
        
        RegistroProdutos[] produto = new RegistroProdutos[10];
        produto[0] = new RegistroProdutos();
        System.out.println(produto[0].calculo());
        
    }
    
}*/

 
