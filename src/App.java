import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new cliente(String nome, int cpf, double saldo);
        String nome;
        int cpf;
        double saldo;

        cliente.inserirCliente(nome, cpf, saldo);
    }
}
