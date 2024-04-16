import java.util.Scanner;

public class Cliente {
    private double saldo1;

    public Cliente(double saldo) {
        saldo1 = saldo;
    }

    Scanner sc = new Scanner(System.in);
    public void inserirCliente() {
        System.out.println("Informe seu nome e sobrenome");
        String nome = sc.nextLine();
        System.out.println("Informe seu cpf");
        int cpf = sc.nextInt();
        System.out.println("Informe seu saldo");
        double saldo = sc.nextDouble();
    }
}