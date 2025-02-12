package KBTU.controller;

import KBTU.factory.UserFactory;
import KBTU.model.Course;
import KBTU.model.Major;
import KBTU.model.User;
import KBTU.service.KbtuService;
import KBTU.service.KbtuServiceImpl;

import java.util.List;
import java.util.Scanner;

public class KbtuController {
    private KbtuService kbtuService = new KbtuServiceImpl();

    public void createUser(UserFactory factory){
        User user = factory.createUser();
        kbtuService.createUser(user);
    }

    public User getUserByUsername(String username){
        return kbtuService.getUserByUsername(username);
    }

    public List<User> getAllUsers(){
        return kbtuService.getAllUsers();
    }

    public void deleteUserByUsername(String username){
        kbtuService.deleteUserByUsername(username);
    }

    public void createMajor(Major major){
        kbtuService.createMajor(major);
    }

    public Major getMajorById(String majorId){
        return kbtuService.getMajorById(majorId);
    }

    public List<Major> getAllMajors(){
        return kbtuService.getAllMajors();
    }

    public void deleteMajorById(String majorId){
        kbtuService.deleteMajorById(majorId);
    }

    public void createCourse(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id курса: ");
        String courseId;
        while(true){
            String temp = scanner.nextLine();
            if(kbtuService.getCourseById(temp) == null){
                System.out.print("id для курса успешно выбран!");
                courseId = temp;
                break;
            }
            System.out.print("Курс с таким id уже существует");
        }
        System.out.print('\n' + "Введите имя курса: ");
        String courseName = scanner.nextLine();
        Course course = new Course(courseId, courseName);

        System.out.println("--Добавьте major для курса--");
        List<Major> majors = kbtuService.getAllMajors();
        for(Major major : majors){
            System.out.println(major.getMajorId() + " " + major.getMajorName());
        }
        while(true){
            System.out.println("(0)Если хотите остановить процесс добавление major");
            String choice = scanner.nextLine();
            if(choice.equals("0")){
                break;
            } else {
                course.addMajors(getMajorById(choice));
            }
        }
        kbtuService.createCourse(new Course(courseId, courseName));
    }

    public Course getCourseById(String courseId){
        return kbtuService.getCourseById(courseId);
    }

    public List<Course> getAllCourse(){
        return kbtuService.getAllCourse();
    }

    public void deleteCourseById(String courseId){
        kbtuService.deleteCourseById(courseId);
    }
}
