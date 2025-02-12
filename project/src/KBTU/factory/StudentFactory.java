package KBTU.factory;

import KBTU.model.Major;
import KBTU.model.Student;
import KBTU.model.User;
import KBTU.repository.MajorRepository;
import KBTU.repository.UserRepository;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentFactory implements UserFactory{
    UserRepository userRepository = new UserRepository();
    MajorRepository majorRepository = new MajorRepository();

    public User createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пользователь для студента: ");
        String username;
        while(true){
            String temp = scanner.nextLine();
            if(userRepository.getUserByUsername(temp) == null){
                System.out.print('\n' + "Логин соотвествует!");
                username = temp;
                break;
            } else {
                System.out.print('\n' + "Данный логин уже существует попробуйте другой!");
            }
        }
        System.out.print('\n' + "Введите пароль для студенту: ");
        String password = scanner.nextLine();
        System.out.print('\n' + "Введите id для студенту: ");
        String studentId = scanner.nextLine();
        System.out.print('\n' + "Введите ИИН для студенту: ");
        String iin = scanner.nextLine();
        System.out.print('\n' + "Введите ФИО студента: ");
        String fullName = "";
        for(int i = 0; i < 3; i ++){
            String str = scanner.next();
            fullName += str + " ";
        }
        System.out.print('\n' + "--Дата рождение студента--");
        Date birthDate = new Date(0,0,0);
        System.out.print('\n' + "Введите день,месяц,год рождение через пробел:");
        int day = scanner.nextInt();
        birthDate.setMonth(day);
        int month = scanner.nextInt();
        birthDate.setMonth(month);
        int year = scanner.nextInt();
        birthDate.setMonth(year);
        System.out.print('\n' + "Введите пол студента(М, Ж)");
        while(!scanner.hasNext("м|М|ж|Ж")){
            System.out.print('\n' + "Введен неправильный пол, пожалуйста введите пол в формате(М, Ж):");
            scanner.next();
        }
        String gender = scanner.next();
        System.out.print('\n' + "Введите год обучение у студента: ");
        int yearOfStudy = scanner.nextInt();
        System.out.println("Введите специальность студента");
        List<Major> majors = majorRepository.getAllMajors();
        for(Major major : majors){
            System.out.println(major.getMajorId() + " " + major.getMajorName());
        }
        Major major;
        while(true){
            System.out.print('\n' + "Введите major id: ");
            String majorId = scanner.nextLine();
            if(majorRepository.getMajorById(majorId) != null){
                major = majorRepository.getMajorById(majorId);
                break;
            }
            System.out.print('\n' + "Такого major не существует!");
        }
        return new Student(username, password, studentId, iin, fullName, birthDate, major, yearOfStudy, gender);
    }

    @Override
    public User createUser() {
        return createStudent();
    }
}
