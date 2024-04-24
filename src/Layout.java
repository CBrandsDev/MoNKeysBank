import java.util.Scanner;

public class Layout {
    public void mainMenu() {
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
    }

    public void loginMenu() {
        System.out.println("______________________________");
        System.out.println("|MoN Keys Bank                ");
        System.out.println("|                             ");
        System.out.println("|Login                        ");
        System.out.println("|Username:                    ");
        if(username = null) {
            System.out.println("|                             ");
        } else {
            System.out.println("|"+username+"                             ");
        }
        System.out.println("|Password:                    ");
        System.out.println("|                             ");
        System.out.println("|                             ");
        System.out.println("|_____________________________");
    }
    public void clean() {
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
    
    public void closeApp() {
        System.out.println("Thank you for using MoN Keys Bank services");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████░░░░░░░░░\n░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███░░░░░░░\n░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███░░░░\n░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░\n░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███░\n░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\n░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\n░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\n░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\n██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\n█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\n██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░\n░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░░\n░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░░\n░░████████████░░░█████████████████░░░░░░");
    }
    @SuppressWarnings("resource")
    public Player newSave() {
        Layout lyt = new Layout();
        lyt.clean();
        Scanner sc = new Scanner(System.in);
        System.out.println("                        REGISTER\nType your name: ");
        String name = sc.nextLine();
        lyt.clean();
        System.out.println("                        REGISTER");
        System.out.println("Type your CPF: ");
        long cpf = sc.nextLong();
        sc.nextLine();
        lyt.clean();
        System.out.println("                        REGISTER");
        System.out.println("Type your password: ");
        String password = sc.nextLine();
        lyt.clean();
        String scPass = "";
        int index = 0;
        while (!password.equals(scPass)) {
            index++;
            if(index == 1) {
                lyt.clean();
                System.out.println("                        REGISTER");
                System.out.println("Type your password again: ");
                scPass = sc.nextLine();
                index++;
            }
            else if(index <= 7) {
                lyt.clean();
                System.out.println("                        REGISTER");
                System.out.println("Incorrect password, type again: ");
                scPass = sc.nextLine();
                index++;
            } else if(index > 7) {
                lyt.closeApp();
                System.exit(0);
            }    
        }
        lyt.clean();
        System.out.println("                        REGISTER");
        System.out.println("                                       ");
        System.out.println("Min: M$ 1000, Max: M$ 5000 (VIP: M$ = $$$)                                      ");
        System.out.println("Enter the amount you wish to deposit: ");
        double balance = sc.nextDouble();
        boolean notVip = true;
        while(notVip = true){
            if(balance > 5000) {
                lyt.clean();
                System.out.println("                        REGISTER");
                System.out.println("");
                System.out.println("Only VIP's can deposit more than M$ 5000 ");
                System.out.println("Enter the amount you wish to deposit:   ");
                balance = sc.nextDouble();
            } else if (balance < 999) {
                lyt.clean();
                System.out.println("                        REGISTER");
                System.out.println("");
                System.out.println("Only VIP's can deposit less than M$ 1000");
                System.out.println("Enter the amount you wish to deposit:   ");
                balance = sc.nextDouble();
                
            } else {
                break;
            }
        }
        
        Player player = new Player(name, cpf, balance ,password);
        return player;
    }
    

    @SuppressWarnings("resource")
    public void menu() {
        Scanner sc = new Scanner(System.in);
        Layout lyt = new Layout();
        lyt.clean();
        Player player = lyt.newSave();
        Life balance = new Life(player.balance);
        player.balance = balance.getSaldo();
        lyt.clean();
        boolean index = true;
        int turn = 1;
        while(index == true) {
            lyt.clean();
            System.out.println("                   MON KEYS BANK");
            System.out.println("                   Welcome " + player.name);
            System.out.println("CPF: " + player.cpf);
            System.out.println("Balance: M$ " + player.balance + "\n");
            System.out.println("                        What do you want to do?\n                                   Withdraw - 1\n                                    Deposit - 2\n                                       Exit - 3");
            int menu = sc.nextInt();
            turn++;
            if(menu == 1) {
                player.sacar(player.balance);
                lyt.clean();
                System.out.println("Balance: " + player.balance);
                
                System.out.println("Do you want to return to the menu? [1 - Yes | 2 - No]");
                int verificador = sc.nextInt();
                if(verificador == 2) {
                    lyt.clean();
                    lyt.closeApp();
                    index = false;
                }
                
            } else if (menu == 2) {
                player.depositar(player.balance);
                lyt.clean();
                System.out.println("Balance: " + player.balance);
                System.out.println("Do you want to return to the menu? [1 - Yes | 2 - No]");
                int verificador = sc.nextInt();
                if(verificador == 2) {
                    lyt.clean();
                    lyt.closeApp();
                    index = false;
                }
            } else if(menu == 3) {
                lyt.clean();
                lyt.mainMenu();
            } else if (menu <= 0 && menu >= 4) {
                lyt.clean();
            }

        }
        
    }
}