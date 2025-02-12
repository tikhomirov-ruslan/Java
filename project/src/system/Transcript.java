package system;

import java.util.*;

public class Transcript {
    private List<Integer> grades;
    private int attendanceLog;

    public Transcript() {
        this.grades = new ArrayList<>();
        this.attendanceLog = 0;
    }
    public List<Integer> getStudentGrades() {
        return grades;
    }
    public int getStudentAttendanceLog() {
        return attendanceLog;
    }
    public enum Grade {
        A, B, C, D, F
    }
}
