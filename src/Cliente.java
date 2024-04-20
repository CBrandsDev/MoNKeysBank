import java.util.Scanner;

public class Cliente {
    double saldo;
    String nome;
    String password;
    long cpf;
    Impressoes impressoes = new Impressoes();
    Saldo total = new Saldo(saldo);
    Scanner sc = new Scanner(System.in);

    public Cliente(String nome, long cpf, double saldo
     , String password) {
        this.saldo = saldo;
        this.nome = nome;
        this.cpf = cpf;
        this.password = password;
    }
    
    public double depositar(double total) {
        impressoes.limpar();
        System.out.println("Enter the amount you wish to deposit: ");
        double deposito = sc.nextDouble();
        saldo = deposito + saldo;
        return saldo;
    }
    public double sacar(double total) {
        impressoes.limpar();
        System.out.println("Enter the amount you want to withdraw: ");
        double saque = sc.nextDouble();
        if (saque > saldo) {
            System.out.println("Insufficient funds");
            return 0;
        }
        saldo = saldo - saque;
        return saldo;
    }
    
}