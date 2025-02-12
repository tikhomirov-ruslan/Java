package KBTU.repository;

import KBTU.model.User;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public void createUser(User user) {
        List<User> users = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/user.bin"))) {
            while(true){
                users.add((User) ois.readObject());
            }
        } catch (Exception e) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/user.bin"))) {
                for(User x : users){
                    oos.writeObject(x);
                }
                oos.writeObject(user);
            } catch (Exception er) {
                throw new RuntimeException(er);
            }
        }
    }

    public User getUserByUsername(String username) {
        User user = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/user.bin"))) {
            User temp;
            while(true){
                temp = (User) ois.readObject();
                if(username.equals(temp.getUsername())){
                    user = temp;
                    break;
                }
            }
        } catch (Exception e) {
            if(user == null)
                System.out.println("Пользователей с данным логином не существует!");
        }
        return user;
    }

    public List<User> getAllUsers() {
        List<User> users = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/user.bin"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof User) {
                        users.add((User) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public void deleteUserByUsername(String username) {
        List<User> users = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/user.bin"))) {
            while(true){
                User temp = (User) ois.readObject();
                if(!username.equals(temp.getUsername())){
                    users.add(temp);
                }
            }
        } catch (Exception e) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/user.bin"))) {
                for(User x : users){
                    oos.writeObject(x);
                }
            } catch (Exception er) {
                throw new RuntimeException(er);
            }
        }
        System.out.println("Успешно удален!");
    }
}
