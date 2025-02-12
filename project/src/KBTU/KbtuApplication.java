package KBTU;

import KBTU.model.Admin;
import KBTU.security.AuthenticationSystem;
import KBTU.view.ConsoleUI;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class KbtuApplication {
    public static void main(String[] args) {
        God god = new God();
        god.run();

        while(true){
            String username = AuthenticationSystem.getInstance().run();

            ConsoleUI consoleUI = new ConsoleUI(username);
            consoleUI.run();
        }
    }
}
