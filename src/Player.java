import java.util.Scanner;

public class Player {
    double balance;
    String name;
    String password;
    long cpf;
    Layout lyt = new Layout(name, cpf, balance, password);
    Life total = new Life(balance);
    Scanner sc = new Scanner(System.in);

    public Player(String name, long cpf, double balance
     , String password) {
        this.balance = balance;
        this.name = name;
        this.cpf = cpf;
        this.password = password;
    }
    
    public String getPlayerName() {
        return name;
    }
    public long getPlayerCpf() {
        return cpf;
    }
    public String getPlayerPass() {
        return password;
    } 
    
    
    public double depositar(double total) {
        lyt.clean();
        System.out.println("Enter the amount you wish to deposit: ");
        double deposito = sc.nextDouble();
        balance = deposito + balance;
        return balance;
    }
    public double sacar(double total) {
        lyt.clean();
        System.out.println("Enter the amount you want to withdraw: ");
        double saque = sc.nextDouble();
        if (saque > balance) {
            System.out.println("Insufficient funds");
            return 0;
        }
        balance = balance - saque;
        return balance;
    }
    
}