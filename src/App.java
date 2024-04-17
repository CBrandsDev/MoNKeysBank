import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Impressoes impressoes = new Impressoes();
        impressoes.limpar();
        Cliente cliente = impressoes.pegarInfoCliente();
        Saldo saldo = new Saldo(cliente.saldo);
        cliente.saldo = saldo.getSaldo();
        impressoes.limpar();
        boolean index = true;
        while(index == true) {
            impressoes.limpar();
            System.out.println("ANHAGUERA BANK");
            System.out.println("Bem vindo " + cliente.nome);
            System.out.println("CPF: " + cliente.cpf);
            System.out.println("Saldo disponivel: " + cliente.saldo);
            System.out.println("O que deseja fazer?\n 1 - Sacar\n 2 - Depositar\n 3 - Sair");
            int menu = sc.nextInt();
            if(menu == 1) {
                cliente.sacar(cliente.saldo);
                System.out.println("Saldo disponivel: " + cliente.saldo);
                System.out.println("Deseja voltar ao menu? [1 - sim | 2 - não]");
                int verificador = sc.nextInt();
                if(verificador == 2) {
                    impressoes.limpar();
                    impressoes.fechandoApp();
                    index = false;
                }
                
            } else if (menu == 2) {
                cliente.depositar(cliente.saldo);
                System.out.println("Saldo disponivel: " + cliente.saldo);
                System.out.println("Deseja voltar ao menu? [1 - sim | 2 - não]");
                int verificador = sc.nextInt();
                if(verificador == 2) {
                    impressoes.limpar();
                    impressoes.fechandoApp();
                    index = false;
                }
            } else if(menu == 3) {
                impressoes.limpar();
                impressoes.fechandoApp();
                System.exit(0);
            } else if (menu <= 0 && menu >= 4) {
                impressoes.limpar();
            }

        }
     
        
    }
}
