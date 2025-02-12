package system;

import java.util.*;

public class Registration {
    private boolean registration;
    private List<String> courseAssignment;
    public Registration(boolean registration) {
        this.registration = registration;
        this.courseAssignment = new ArrayList<>();
    }
    public boolean getRegistration() {
        return registration;
    }

    public List<String> getCourseAssignment() {
        return courseAssignment;
    }
}
