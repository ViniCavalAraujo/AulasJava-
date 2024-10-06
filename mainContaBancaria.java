public class mainContaBancaria {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();

        System.out.println("\n");
        System.out.println("Número da conta inserido:"+conta.numeroConta);
        System.out.println("Nome do titular:"+conta.titular);
        System.out.println("Saldo disponível:"+conta.saldo);


        conta.depositar();
        conta.sacar();
        conta.verificarSaldo();

        // da pra usar assim quando o método utiliza return
        //System.out.println(conta.depositar()); 
        //System.out.println(conta.sacar());

    }
    
}
