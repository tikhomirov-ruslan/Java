package KBTU.service;

import KBTU.model.Course;
import KBTU.model.Major;
import KBTU.model.User;

import java.util.List;

public interface KbtuService {

    //User
    void createUser(User user);
    User getUserByUsername(String username);
    List<User> getAllUsers();
    void deleteUserByUsername(String username);

    //Major
    void createMajor(Major major);
    Major getMajorById(String majorId);
    List<Major> getAllMajors();
    void deleteMajorById(String majorId);

    //Course
    void createCourse(Course course);
    Course getCourseById(String courseId);
    List<Course> getAllCourse();
    void deleteCourseById(String courseId);

}
