import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double somaNotas = 0; // Variável para acumular a soma das notas
        int totalNotas = 5; // Número total de notas

        System.out.println("Aluno(a) informe seu nome: ");
        nome = sc.nextLine();

        for (int i = 0; i < totalNotas; i++) {
            System.out.println("Informe a nota " + (i + 1) + ":");
            double nota = Double.parseDouble(sc.nextLine());
            somaNotas += nota; // Acumula a nota na variável somaNotas
        }

        double media = somaNotas / totalNotas; // Calcula a média

        System.out.println("A média das notas de " + nome + " é: " + media);

        sc.close();
    }
}
 
    

