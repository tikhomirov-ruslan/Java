package KBTU.view;

import KBTU.controller.KbtuController;
import KBTU.factory.ManagerFactory;
import KBTU.factory.StudentFactory;
import KBTU.factory.TeacherFactory;
import KBTU.model.*;


import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    KbtuController kbtuController = new KbtuController();

    private String username;

    public ConsoleUI(String username) {
        this.username = username;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        User user = kbtuController.getUserByUsername(username);

        if (user instanceof Student) {
            while (true) {
                System.out.println("\n" +
                        "  _  _____ _____ _   _ \n" +
                        " | |/ / _ )_   _| | | |\n" +
                        " | ' <| _ \\ | | | |_| |\n" +
                        " |_|\\_\\___/ |_|  \\___/ " + "   Hello Student!\n" +
                        "==========================================================");
                System.out.println("(1) Просмотр курсов");
                System.out.println("(2) Регистрация на курсы");
                System.out.println("(3) Просмотр оценок");
                System.out.println("(4) Просмотр транскрипта");
                System.out.println("(5) Оценить учителей");
                System.out.println("(6) Получить транскрипт");
                System.out.println("(0) Выйти с аккаунта");

                int choice = -1;
                if (!scanner.hasNext("1|2|3|4|0")) {
                    System.out.println("Такой команды не существует");
                } else {
                    choice = scanner.nextInt();
                }

                switch (choice) {
                    case 1 -> {
                        List<Course> courses = kbtuController.getAllCourse();
                        System.out.println("---------------Все курсы-------------");
                        for(Course course : courses){
                            System.out.println(course);
                        }
                        System.out.println("-Введите любой символ чтобы выйти в главное меню");
                        String temp = scanner.next();
                    }
                    case 2 -> System.out.println("Данная фича не готова");
                    case 3 -> System.out.println("Данная фича не готова");
                    case 4 -> System.out.println("Данная фича не готова");
                    case 0 -> {
                        System.out.println('\n' + "Выход..." + '\n');
                        return;
                    }
                }
            }
        }

        if (user instanceof Teacher) {
            while (true) {
                System.out.println("\n" +
                        "  _  _____ _____ _   _ \n" +
                        " | |/ / _ )_   _| | | |\n" +
                        " | ' <| _ \\ | | | |_| |\n" +
                        " |_|\\_\\___/ |_|  \\___/ " + "   Hello Teacher!\n" +
                        "==========================================================");
                System.out.println("(1) Добавить пользователя");
                System.out.println("(2) Обновить данные пользователя");
                System.out.println("(3) Удалить пользователя");
                System.out.println("(4) Посмотреть всех пользователей");
                System.out.println("(0) Выйти с аккаунта");

                int choice = -1;
                if (!scanner.hasNext("1|2|3|4|0")) {
                    System.out.println("Такой команды не существует");
                } else {
                    choice = scanner.nextInt();
                }

                switch (choice) {
                    case 1 -> System.out.println("Данная фича не готова");
                    case 2 -> System.out.println("Данная фича не готова");
                    case 3 -> System.out.println("Данная фича не готова");
                    case 4 -> System.out.println("Данная фича не готова");
                    case 0 -> {
                        System.out.println('\n' + "Выход..." + '\n');
                        return;
                    }
                }
            }
        }

        if (user instanceof Manager) {
            while (true) {
                System.out.println("\n" +
                        "  _  _____ _____ _   _ \n" +
                        " | |/ / _ )_   _| | | |\n" +
                        " | ' <| _ \\ | | | |_| |\n" +
                        " |_|\\_\\___/ |_|  \\___/ " + "   Hello Manager!\n" +
                        "==========================================================");
                System.out.println("(1) Добавить курсы для регистраций");
                System.out.println("(2) Одобрить регистрацию студентов");
                System.out.println("(3) Назначать курсы преподавателям");
                System.out.println("(4) Управление новостями");
                System.out.println("(5) Назначать курсы преподавателям");
                System.out.println("(6) Посмотреть информацию всех учителей");
                System.out.println("(7) Посмотреть информацию всех студентах");
                System.out.println("(8) Просмотр обращений от сотрудников");
                System.out.println("(0) Выйти с аккаунта");

                int choice = -1;
                if (!scanner.hasNext("1|2|3|4|5|6|7|8|0")) {
                    System.out.println("Такой команды не существует");
                } else {
                    choice = scanner.nextInt();
                }

                switch (choice) {
                    case 1 -> {
                        kbtuController.createCourse();
                    }
                    case 2 -> System.out.println("Данная фича не готова");
                    case 3 -> System.out.println("Данная фича не готова");
                    case 4 -> System.out.println("Данная фича не готова");
                    case 0 -> {
                        System.out.println('\n' + "Выход..." + '\n');
                        return;
                    }
                }
            }
        }

        if (user instanceof Admin) {
            while (true) {
                System.out.println("\n" +
                        "  _  _____ _____ _   _ \n" +
                        " | |/ / _ )_   _| | | |\n" +
                        " | ' <| _ \\ | | | |_| |\n" +
                        " |_|\\_\\___/ |_|  \\___/ " + "   Hello Admin!\n" +
                        "==========================================================");
                System.out.println("(1) Добавить пользователя");
                System.out.println("(2) Обновить данные пользователя");
                System.out.println("(3) Удалить пользователя");
                System.out.println("(4) Посмотреть всех пользователей");
                System.out.println("(0) Выйти с аккаунта");

                int choice = -1;
                if (!scanner.hasNext("1|2|3|4|0")) {
                    System.out.println("Такой команды не существует");
                } else {
                    choice = scanner.nextInt();
                }

                switch (choice) {
                    case 1 -> {
                        boolean isStop = false;
                        while (!isStop) {
                            System.out.println("Кого вы хотите добавить? студента(1), учителя(2), менеджера(3)");
                            System.out.println(" <--Назад(0)");
                            int c = -1;
                            if (!scanner.hasNext("1|2|3|0")) {
                                System.out.println("Такой команды не существует");
                            } else {
                                c = scanner.nextInt();
                            }
                            switch (c) {
                                case 1 -> {
                                    kbtuController.createUser(new StudentFactory());
                                }
                                case 2 -> {
                                    kbtuController.createUser(new TeacherFactory());
                                }
                                case 3 -> {
                                    kbtuController.createUser(new ManagerFactory());
                                }
                                case 0 -> {
                                    isStop = true;
                                }
                            }
                        }
                    }
                    case 2 -> System.out.println("Данная фича не готова");
                    case 3 -> {
                        System.out.println("Пожалуйста введите логин пользователя который нужно удалить!");
                        String username = scanner.next();
                        kbtuController.deleteUserByUsername(username);
                    }
                    case 4 -> {
                        List<User> users = kbtuController.getAllUsers();
                        for (User x : users) {
                            System.out.println(x);
                        }
                    }
                    case 0 -> {
                        System.out.println('\n' + "Выход..." + '\n');
                        return;
                    }
                }
            }
        }
    }
}
