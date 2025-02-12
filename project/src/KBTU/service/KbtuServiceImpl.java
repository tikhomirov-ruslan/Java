package KBTU.service;

import KBTU.model.Course;
import KBTU.model.Major;
import KBTU.model.User;
import KBTU.repository.CourseRepository;
import KBTU.repository.MajorRepository;
import KBTU.repository.UserRepository;

import java.util.List;

public class KbtuServiceImpl implements KbtuService {
    private UserRepository userRepository = new UserRepository();
    private MajorRepository majorRepository = new MajorRepository();
    private CourseRepository courseRepository = new CourseRepository();

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public void deleteUserByUsername(String username) {
        userRepository.deleteUserByUsername(username);
    }

    @Override
    public void createMajor(Major major) {
        majorRepository.createMajor(major);
    }

    @Override
    public Major getMajorById(String majorId) {
        return majorRepository.getMajorById(majorId);
    }

    @Override
    public List<Major> getAllMajors() {
        return majorRepository.getAllMajors();
    }

    @Override
    public void deleteMajorById(String majorId) {
        majorRepository.deleteMajorById(majorId);
    }

    @Override
    public void createCourse(Course course) {
        courseRepository.createCourse(course);
    }

    @Override
    public Course getCourseById(String courseId) {
        return courseRepository.getCourseById(courseId);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.getAllCourses();
    }

    @Override
    public void deleteCourseById(String courseId) {
        courseRepository.deleteCourseById(courseId);
    }
}
