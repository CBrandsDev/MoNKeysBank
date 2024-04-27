import java.util.Scanner;
public class Game extends Player {
    
    public Game(String name, String password, double balance, long cpf) {
        super(name, cpf, balance, password);
    }

    public void init() {
        Layout lyt = new Layout(super.name, super.password, super.balance, super.cpf);
        Scanner sc = new Scanner(System.in);
        lyt.clean();
        lyt.newSave();
        System.out.println("");
        System.out.println("Type your Name: ");
        super.name = sc.nextLine();
        lyt.clean();
        lyt.newSave();
        System.out.println("");
        System.out.println("Type your CPF: ");
        super.cpf = sc.nextLong();
        lyt.clean();
        lyt.newSave();
        System.out.println("");
        System.out.println("Type your password: ");
        super.password = sc.nextLine();
        lyt.clean();
        String scPass = "";
        int index = 0;
        while (!super.password.equals(scPass)) {
            index++;
            if(index == 1) {
                lyt.clean();
                lyt.newSave();
                System.out.println("");
                System.out.println("Type your password again: ");
                scPass = sc.nextLine();
                index++;
            }
            else if(index <= 7) {
                lyt.clean();
                lyt.newSave();
                System.out.println("");
                System.out.println("Incorrect password, type again: ");
                scPass = sc.nextLine();
                index++;
            } else if(index > 7) {
                lyt.closeApp();
                System.exit(0);
            }    
        }
        lyt.clean();
        lyt.newSave();
        System.out.println("");
        System.out.println("Min: M$ 1000, Max: M$ 5000 (VIP: M$ = $$$)                                      ");
        System.out.println("Enter the amount you wish to deposit: ");
        super.balance = sc.nextDouble();
        boolean notVip = true;
        while(notVip = true){
            if(balance > 5000) {
                lyt.clean();
                lyt.newSave();
                System.out.println("");
                System.out.println("Only VIP's can deposit more than M$ 5000 ");
                System.out.println("Enter the amount you wish to deposit:   ");
                super.balance = sc.nextDouble();
            } else if (balance < 999) {
                lyt.clean();
            
                System.out.println("");
                System.out.println("Only VIP's can deposit less than M$ 1000");
                System.out.println("Enter the amount you wish to deposit:   ");
                balance = sc.nextDouble();
                
            } else {
                break;
            }
        }
        
        lyt.mainMenu();
    }
        
}

