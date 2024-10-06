import java.util.Scanner;

public class ContaBancaria {


    public String numeroConta;
    public String titular;
    public double saldo;

    private static Scanner sc = new Scanner(System.in);

    public ContaBancaria(){

    

        System.out.println("Informe o número da conta:");
        this.numeroConta = sc.nextLine();

        System.out.println("Nome titular da conta:");
        this.titular = sc.nextLine();

        System.out.println("Saldo disponível:");
        this.saldo = Double.parseDouble(sc.nextLine());

    }

    public void depositar(){

       
        double deposito;
        System.out.println("Quanto deseja depositar:");
        deposito = Double.parseDouble(sc.nextLine());
        System.out.println("Depósito efetuado de:"+deposito);
        saldo += deposito;
        //System.out.println("Saldo disponível:");

         
    }

    public void sacar(){

        double sacar;
        System.out.println("Quanto deseja sacar:");
        sacar = Double.parseDouble(sc.nextLine());
        System.out.println("Saque efetuado de:"+sacar);
        saldo -= sacar;
        //System.out.println("Saldo disponível:");

        
    }

    public void verificarSaldo(){

        System.out.println("Saldo disponível:"+saldo);
    }
    
}
