import java.util.Scanner;

public class Impressoes {
    public void mainMenu() {
        Impressoes impressoes = new Impressoes();
        Scanner sc = new Scanner(System.in);
        impressoes.limpar();
        System.out.println("______________________________");
        System.out.println("|  Welcome to MoN Keys Bank  |");
        System.out.println("|                            |");
        System.out.println("|        1 - Login           |");
        System.out.println("|        2 - Register        |");
        System.out.println("|        3 - Exit            |");
        System.out.println("|                            |");
        System.out.println("|                            |");
        System.out.println("|        4 - Help            |");
        System.out.println("|____________________________|");
        int menu = 0;
        menu = sc.nextInt();
        if(menu == 2) {
            menu = 0;
            impressoes.newSave();
            impressoes.menu();
        }
        else if (menu == 3) {
            impressoes.fechandoApp();
            System.exit(0);
        }
    }
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
        System.out.println("Thank you for using MoN Keys Bank services");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████░░░░░░░░░\n░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███░░░░░░░\n░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███░░░░\n░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░\n░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███░\n░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\n░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\n░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\n██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\n█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\n██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░\n░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░░\n░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░\n░░████████████░░░█████████████████░░░░░░");
    }
    @SuppressWarnings("resource")
    public Cliente newSave() {
        Impressoes impressoes = new Impressoes();
        impressoes.limpar();
        Scanner sc = new Scanner(System.in);
        System.out.println("                        REGISTER\nType your name: ");
        String nome = sc.nextLine();
        impressoes.limpar();
        System.out.println("                        REGISTER");
        System.out.println("Type your CPF: ");
        long cpf = sc.nextLong();
        sc.nextLine();
        impressoes.limpar();
        System.out.println("                        REGISTER");
        System.out.println("Type your password: ");
        String password = sc.nextLine();
        impressoes.limpar();
        String scPass = "";
        int index = 0;
        while (!password.equals(scPass)) {
            index++;
            if(index == 1) {
                impressoes.limpar();
                System.out.println("                        REGISTER");
                System.out.println("Type your password again: ");
                scPass = sc.nextLine();
                index++;
            }
            else if(index <= 7) {
                impressoes.limpar();
                System.out.println("                        REGISTER");
                System.out.println("Incorrect password, type again: ");
                scPass = sc.nextLine();
                index++;
            } else if(index > 7) {
                impressoes.fechandoApp();
                System.exit(0);
            }    
        }
        impressoes.limpar();
        System.out.println("                        REGISTER");
        System.out.println("                                       ");
        System.out.println("Min: M$ 1000, Max: M$ 5000 (VIP: M$ = $$$)                                      ");
        System.out.println("Enter the amount you wish to deposit: ");
        double saldo = sc.nextDouble();
        boolean notVip = true;
        while(notVip = true){
            if(saldo > 5000) {
                impressoes.limpar();
                System.out.println("                        REGISTER");
                System.out.println("");
                System.out.println("Only VIP's can deposit more than M$ 5000 ");
                System.out.println("Enter the amount you wish to deposit:   ");
                saldo = sc.nextDouble();
            } else if (saldo < 999) {
                impressoes.limpar();
                System.out.println("                        REGISTER");
                System.out.println("");
                System.out.println("Only VIP's can deposit less than M$ 1000");
                System.out.println("Enter the amount you wish to deposit:   ");
                saldo = sc.nextDouble();
                
            } else {
                break;
            }
        }
        
        Cliente cliente = new Cliente(nome, cpf, saldo ,password);
        return cliente;
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
            System.out.println("                   MON KEYS BANK");
            System.out.println("                   Welcome " + cliente.nome);
            System.out.println("CPF: " + cliente.cpf);
            System.out.println("Balance: M$ " + cliente.saldo + "\n");
            System.out.println("                        What do you want to do?\n                                   Withdraw - 1\n                                    Deposit - 2\n                                       Exit - 3");
            int menu = sc.nextInt();
            turn++;
            if(menu == 1) {
                cliente.sacar(cliente.saldo);
                impressoes.limpar();
                System.out.println("Balance: " + cliente.saldo);
                
                System.out.println("Do you want to return to the menu? [1 - Yes | 2 - No]");
                int verificador = sc.nextInt();
                if(verificador == 2) {
                    impressoes.limpar();
                    impressoes.fechandoApp();
                    index = false;
                }
                
            } else if (menu == 2) {
                cliente.depositar(cliente.saldo);
                impressoes.limpar();
                System.out.println("Balance: " + cliente.saldo);
                System.out.println("Do you want to return to the menu? [1 - Yes | 2 - No]");
                int verificador = sc.nextInt();
                if(verificador == 2) {
                    impressoes.limpar();
                    impressoes.fechandoApp();
                    index = false;
                }
            } else if(menu == 3) {
                impressoes.limpar();
                impressoes.mainMenu();
            } else if (menu <= 0 && menu >= 4) {
                impressoes.limpar();
            }

        }
        
    }
}