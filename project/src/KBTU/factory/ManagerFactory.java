package KBTU.factory;

import KBTU.model.Manager;
import KBTU.model.User;
import KBTU.repository.UserRepository;

import java.util.Date;
import java.util.Scanner;

public class ManagerFactory implements UserFactory{
    UserRepository userRepository = new UserRepository();

    public Manager createManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пользователь для менеджера: ");
        String username;
        while(true){
            String temp = scanner.nextLine();
            if(userRepository.getUserByUsername(temp) == null){
                System.out.print('\n' + "Логин принят!");
                username = temp;
                break;
            } else {
                System.out.print('\n' + "Данный логин уже существует попробуйте другой!");
            }
        }
        System.out.print('\n' + "Введите пароль для менеджера: ");
        String password = scanner.nextLine();
        System.out.print('\n' + "Введите id для менеджера: ");
        String managerId = scanner.nextLine();
        System.out.print('\n' + "Введите ИИН для менеджера: ");
        String iin = scanner.nextLine();
        System.out.print('\n' + "Введите ФИО менеджера: ");
        String fullName = "";
        for(int i = 0; i < 3; i ++){
            String str = scanner.next();
            fullName += str + " ";
        }
        System.out.print('\n' + "--Дата рождение менеджера--");
        Date birthDate = new Date(0,0,0);
        System.out.print('\n' + "Введите день,месяц,год рождение через пробел:");
        birthDate.setMonth(scanner.nextInt());
        birthDate.setMonth(scanner.nextInt());
        birthDate.setMonth(scanner.nextInt());
        System.out.print('\n' + "Введите пол менеджера(М, Ж)");
        while(!scanner.hasNext("м|М|ж|Ж")){
            System.out.print('\n' + "Введен неправильный пол, пожалуйста введите пол в формате(М, Ж):");
            scanner.next();
        }
        String gender = scanner.next();
        System.out.print('\n' + "--Дата принятие на работу--");
        System.out.print('\n' + "Введите день,месяц,год рождение через пробел:");
        Date hireDate = new Date(0,0,0);
        hireDate.setMonth(scanner.nextInt());
        hireDate.setMonth(scanner.nextInt());
        hireDate.setMonth(scanner.nextInt());
        return new Manager(username, password, managerId, iin, fullName, birthDate, gender, hireDate);
    }

    @Override
    public User createUser() {
        return createManager();
    }
}
