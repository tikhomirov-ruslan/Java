package KBTU;

import KBTU.controller.KbtuController;
import KBTU.model.*;
import KBTU.service.KbtuService;
import KBTU.service.KbtuServiceImpl;

import java.util.Date;
import java.util.List;

public class God {
    public static KbtuController kbtuController = new KbtuController();
    public static KbtuService kbtuService = new KbtuServiceImpl();

    public static void addDefaultAdmin(){
        kbtuService.createUser(new Admin("admin", "admin", "Admin", "Admin"
                ,new Date(0,0,0)));
    }

    public static void addDefaultManager(){
        kbtuService.createUser(new Manager("manager", "manager", "Manager", "0",
                "-", new Date(0,0,0), "-", new Date(0,0,0)));
    }

    public static void addDefaultTeacher(){
        kbtuService.createUser(new Teacher("teacher", "teacher", "0", "0", "-",
                new Date(0,0,0), "-", new Date(0,0,0)));
    }

    public void run() {
//        kbtuController.createMajor(new Major("23", "23", "1"));
//        kbtuController.createCourse(new Course("23", " 32"));

//        addDefaultAdmin();
//        addDefaultManager();
//        addDefaultTeacher();

//        kbtuController.createMajor(new Major("1", "Информационные системы"));
//        kbtuController.createMajor(new Major("2", "Экономика"));
//        kbtuController.createMajor(new Major("3", "Менеджмент"));
//        kbtuController.createMajor(new Major("4", "Судовождение"));

        List<User> users = kbtuController.getAllUsers();
        List<Major> majors = kbtuController.getAllMajors();
//        List<Course> courses = kbtuController.getAllCourse();

        for(User user : users){
            System.out.println(user);
        }

        for (Major major :majors){
            System.out.println(major);
        }
//
//        for (Course course : courses){
//            System.out.println(course);
//        }
    }
}
