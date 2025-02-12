	package KBTU.repository;

import KBTU.model.Course;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CourseRepository {
    public void createCourse(Course course) {
        List<Course> courses = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/course.bin"))) {
            while(true){
                courses.add((Course) ois.readObject());
            }
        } catch (Exception e) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/course.bin"))) {
                for(Course x : courses){
                    oos.writeObject(x);
                }
                oos.writeObject(course);
            } catch (Exception er) {
                throw new RuntimeException(er);
            }
        }
    }

    public Course getCourseById(String courseId) {
        Course course = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/course.bin"))) {
            Course temp;
            while(true){
                temp = (Course) ois.readObject();
                if(courseId.equals(temp.getCourseId())){
                    course = temp;
                    break;
                }
            }
        } catch (Exception e) {
            if(course == null)
                System.out.println("Данный курс не существует!");
        }
        return course;
    }

    public List<Course> getAllCourses() {
        List<Course> courses = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/course.bin"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Course) {
                        courses.add((Course) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }

    public void deleteCourseById(String courseId) {
        List<Course> courses = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/course.bin"))) {
            while(true){
                Course temp = (Course) ois.readObject();
                if(!courseId.equals(temp.getCourseId())){
                    courses.add(temp);
                }
            }
        } catch (Exception e) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/course.bin"))) {
                for(Course x : courses){
                    oos.writeObject(x);
                }
            } catch (Exception er) {
                throw new RuntimeException(er);
            }
        }
        System.out.println("Успешно удален!");
    }
}