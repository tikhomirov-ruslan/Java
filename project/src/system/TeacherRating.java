package system;
import java.util.*;

public class TeacherRating {
    private Map<Teacher, Integer> teacherRatings; 
    public TeacherRating() {
        this.teacherRatings = new HashMap<>();
    }
    public void rateTeacher(Student student, Teacher teacher, int rating) {
        if (student != null && teacher != null && isValidRating(rating)) {
            teacherRatings.put(teacher, rating);
            System.out.println("Teacher " + teacher.getTeacherName() + " has been rated by student " + student.getStudentName());
        } else {
            System.out.println("Invalid rating or missing student/teacher information.");
        }
    }
    private boolean isValidRating(int rating) {
        return rating >= 1 && rating <= 10; 
    }
    
}
