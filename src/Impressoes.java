import java.util.Scanner;
import java.util.Timer;

public class Impressoes {
    Timer timer = new Timer();
    public void limpar() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println(""); 
    }
    
    public void fechandoApp() {
        System.out.println("Obrigado por usar os serviços do Anhaguera Bank");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████░░░░░░░░░\n░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███░░░░░░░\n░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███░░░░\n░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░\n░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███░\n░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\n░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\n░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\n██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\n█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\n██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░\n░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░░\n░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░\n░░████████████░░░█████████████████░░░░░░");
    }
    @SuppressWarnings("resource")
    public Cliente newSave() {
        Impressoes impressoes = new Impressoes();
        Scanner sc = new Scanner(System.in);
        System.out.println("                        REGISTER\nInsira o nome e sobrenome: ");
        String nome = sc.nextLine();
        impressoes.limpar();
        System.out.println("                        REGISTER");
        System.out.println("Insira o CPF: ");
        long cpf = sc.nextLong();
        impressoes.limpar();
        System.out.println("                        REGISTER");
        System.out.println("Insira sua senha: ");
        String password = sc.nextLine();
        String scPass = "";
        impressoes.limpar();
        while (!scPass.equals(password)) {
            int index = 0;
            if (index == 0) {
                System.out.println("                        REGISTER");
                System.out.println("Insira sua senha: ");
                scPass = sc.nextLine();
                index++;
            } else if(index <= 3) {
                impressoes.limpar();
                System.out.println("                        REGISTER");
                System.out.println("Senha incorreta, digite novamente: ");
                index++;
            } else {
                impressoes.fechandoApp();
            }    
        }
        impressoes.limpar();
        System.out.println("                        REGISTER");
        System.out.println("                                       ");
        System.out.println("Min: M$ 1000, Max: M$ 5000 (VIP: M$ = $$$)                                      ");
        System.out.println("Digite a quantia que deseja depositar: ");
        double saldo = sc.nextDouble();
        boolean notVip = true;
        while(notVip = true){
            if(saldo > 5000) {
                impressoes.limpar();
                System.out.println("                        REGISTER");
                System.out.println("");
                System.out.println("Apenas VIP's podem depositar mais de M$ 5000 ");
                System.out.println("Digite a quantia que deseja depositar:   ");
                saldo = sc.nextDouble();
            } else if (saldo < 999) {
                impressoes.limpar();
                System.out.println("                        REGISTER");
                System.out.println("");
                System.out.println("Apenas VIP's podem depositar menos de M$ 1000 ");
                System.out.println("Digite a quantia que deseja depositar:   ");
                saldo = sc.nextDouble();
                
            } else {
                break;
            }
        }
        
        Cliente cliente = new Cliente(nome, cpf, saldo ,password);
        return cliente;
    }

    public void mainMenu() {
        Impressoes impressoes = new Impressoes();
        System.out.println("  Welcome to MoN Keys Bank");
        System.out.println("                          ");
        System.out.println("        1 - Login         ");
        System.out.println("                          ");
        System.out.println("       2 - Register       ");
        System.out.println("                          ");
        System.out.println("                          ");
        System.out.println("                          ");
        System.out.println("                          ");
        System.out.println("         3 - Help         ");
        int menu = 0;
        if(menu == 2) {
            impressoes.newSave();
        }
    }

    @SuppressWarnings("resource")
    public void menu() {
        Scanner sc = new Scanner(System.in);
        Impressoes impressoes = new Impressoes();
        impressoes.limpar();
        Cliente cliente = impressoes.newSave();
        Saldo saldo = new Saldo(cliente.saldo);
        cliente.saldo = saldo.getSaldo();
        impressoes.limpar();
        boolean index = true;
        int turn = 1;
        while(index == true) {
            impressoes.limpar();
            System.out.println("                   ANHAGUERA BANK");
            System.out.println("               Bem vindo " + cliente.nome);
            System.out.println("CPF: " + cliente.cpf);
            System.out.println("Saldo disponivel: R$ " + cliente.saldo + "\n");
            System.out.println("                        O que deseja fazer?\n                                  Sacar - 1\n                              Depositar - 2\n                                   Sair - 3");
            int menu = sc.nextInt();
            turn++;
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