package system;

import java.util.*;

public class Attendance {
    private boolean isOpen;
    private boolean isStarted;
    private boolean isClosed;
    private Timer timer;
    public Attendance() {
        this.isOpen = false;
        this.isStarted = false;
        this.isClosed = false;
    }
    public void openAttendance() {
        isOpen = true;
        System.out.println("Attendance is now open.");
    }
    public void startAttendance() {
        if (isOpen && !isStarted) {
            isStarted = true;
            timer = new Timer();   
            System.out.println("Attendance has started.");
        } else {
            System.out.println("Unable to start attendance.");
        }
    }
    public void closeAttendance() {
        if (isOpen && isStarted && !isClosed) {
            isClosed = true;
            if (timer != null) {
                timer.cancel(); 
            }
            System.out.println("Attendance is now closed.");
        } else {
            System.out.println("Unable to close attendance.");
        }
    }

    public void stopAttendance() {
        if (isOpen && isStarted && !isClosed) {
            isStarted = false;
            if (timer != null) {
                timer.cancel();
            }
            System.out.println("Attendance has been stopped.");
        } else {
            System.out.println("Unable to stop attendance.");
        }
    }

}
