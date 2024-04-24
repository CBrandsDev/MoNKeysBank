import java.util.Scanner;
public class Game {
    public void init() {
        Layout lyt = new Layout();
        Scanner sc = new Scanner(System.in);
        lyt.clean();
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
