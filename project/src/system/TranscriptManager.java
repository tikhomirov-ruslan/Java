package system;

import java.util.*;

public class TranscriptManager {
    public void addMarksToTranscript(Teacher teacher, Student student, int marks) {
        if (teacher != null && teacher.hasPermission()) {
            String studentTranscript = student.getTranscript(); 
            
            if (studentTranscript != null) {
                List<Integer> grades = studentTranscript.getStudentGrades();
                grades.add(marks);
                System.out.println("Marks added to the transcript for " + student.getStudentName());
            } else {
                System.out.println("Transcript not available for " + student.getStudentName());
            }
        } else {
            System.out.println("Teacher doesn't have permission to add marks.");
        }
    }
}
