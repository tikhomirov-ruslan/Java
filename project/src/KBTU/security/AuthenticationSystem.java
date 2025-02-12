package KBTU.security;

import KBTU.model.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class AuthenticationSystem {
    private static AuthenticationSystem instance;

    private AuthenticationSystem() {}

    public boolean authenticate(String username, String password) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/user.bin"))) {
            try {
                while (true) {
                    User user = (User) ois.readObject();
                    if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
                        return true;
                    }
                }
            } catch (Exception e) {
                System.out.println("End of file reached.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public String run(){
        Scanner scanner = new Scanner(System.in);

        String loadPage = "             ВХОД"+ '\n' +
                "==============================" + '\n' +
                "Пользователь:" + '\n' +
                "Пароль:" + '\n' +
                "----------------------------------------" + '\n' +
                "Hint: Введите пользователь и пароль раздельно";

        String alert = "+---------------------------+" + '\n' +
                "| Неверный логин или пароль |" + '\n' +
                "+---------------------------+" + '\n';

        while(true){
            System.out.println(loadPage);
            String username = scanner.next();
            String password = scanner.next();
            if(authenticate(username, password)){
                System.out.println("Успешный вход");
                return username;
            } else {
                System.out.println(alert);
            }
        }
    }

    public static AuthenticationSystem getInstance() {
        if (instance == null) {
            instance = new AuthenticationSystem();
        }
        return instance;
    }
}
