import java.util.Scanner;
public class Game extends Player {
    
    public Game(String name, long cpf, double balance, String password) {
        super(name, cpf, balance, password);
    }

    public void init() {
        Layout lyt = new Layout(name, cpf, balance, password);
        Scanner sc = new Scanner(System.in);
        lyt.clean();
        lyt.newSave();
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
        
        lyt.mainMenu();
        int menu = 0;
        menu = sc.nextInt();
        if(menu == 1) {
            lyt.loginMenu();
            System.out.println("");
            System.out.println("Type your username:");
            String username;
            username = sc.nextLine();
            if (!username.equals(name)) {
                lyt.clean();
                lyt.loginMenu();
                System.out.println("");
                System.out.println("Incorrect Username: ");
                username = sc.nextLine();
            } else {
                lyt.clean();
                lyt.loginMenu();
                String pass;
                System.out.println("");
                System.out.println("Type your Password: ");
                pass = sc.nextLine();
                if (!pass.equals(password)) {
                    lyt.clean();
                    lyt.loginMenu();
                    System.out.println("");
                    System.out.println("Incorrect password: ");
                    pass = sc.nextLine();
                } else {
                    lyt.menu();
                }
            }
        } else if(menu == 2) {
            lyt.newSave();
            lyt.menu();
        } else if (menu == 3) {
            lyt.closeApp();
            System.exit(0);
        }
    }
        
}

