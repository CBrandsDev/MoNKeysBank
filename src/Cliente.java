import java.util.Scanner;

public class Cliente {
    double saldo;
    String nome;
    String password;
    long cpf;
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
        System.out.println("Digite a quantia que deseja depositar: ");
        double deposito = sc.nextDouble();
        saldo = deposito + saldo;
        return saldo;
    }
    public double sacar(double total) {
        System.out.println("Digite a quantia que deseja sacar: ");
        double saque = sc.nextDouble();
        if (saque > saldo) {
            System.out.println("Saldo insuficiente");
            return 0;
        }
        saldo = saldo - saque;
        return saldo;
    }
    
}