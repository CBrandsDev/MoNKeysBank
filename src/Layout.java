import java.util.Scanner;

public class Layout extends Player {

    public Layout(String name, long cpf, double balance, String password) {
        super(name, cpf, balance, password);
    }

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
        System.out.println("|MoN Keys Bank Login          ");
        System.out.println("|                             ");
        System.out.println("|Login                        ");
        System.out.println("|Username:                    ");
        if(name == null) {
            System.out.println("|                             ");
        } else {
            System.out.println("|"+name+"                             ");
        }
        System.out.println("|Password:                    ");
        System.out.println("|                             ");
        System.out.println("|                             ");
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
    
    public void newSave() {
        System.out.println("______________________________");
        System.out.println("|MoN Keys Bank Register       ");
        System.out.println("|                             ");
        System.out.println("|Username:                    ");
        System.out.println("|                             ");
        System.out.println("|CPF:                         ");
        System.out.println("|                             ");
        System.out.println("|Password:                    ");
        System.out.println("|                             ");
    }
    

    @SuppressWarnings("resource")
    public void menu() {
        Scanner sc = new Scanner(System.in);
        Layout lyt = new Layout(name, cpf, balance, password);
        lyt.clean();
        Player player = lyt;
        Life balance = new Life(lyt.balance);
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