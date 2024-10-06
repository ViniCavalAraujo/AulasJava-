import java.util.Scanner;

public class pessoa {


    public String nome;
    public String sobrenome;
    public int idade;
    public String sexo;
    

    


public pessoa(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Sexo [M] ou [F]");
    this.sexo = sc.nextLine();

    System.out.println("Informe seu nome:");
    this.nome = sc.nextLine();

    System.out.println("Informe seu sobrenome:");
    this.sobrenome = sc.nextLine();

    System.out.println("Idade:");
    this.idade = sc.nextInt();


}


public void idade(){
    System.out.println(nome+" tem "+idade+ " anos");
}

}
