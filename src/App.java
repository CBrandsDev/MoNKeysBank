public class App{
    
    public static void main(String[] args) throws Exception{
        String name;
        long cpf;
        double balance;
        String password;
        Player player = new Player(){};
        Life life = new Life();
        name = player.getPlayerName();
        cpf = player.getPlayerCpf();
        password = player.getPlayerPass();
        balance = life.getSaldo();
        Game game = new Game(name, password, balance, cpf);
        game.init();
        // ta dificil viu
    }

    
}
