package system;

import java.util.*;

public class Messaging {
    private List<String> messages;
    private List<String> complaints;
    public Messaging() {
        this.messages = new ArrayList<>();
        this.complaints = new ArrayList<>();
    }
    public List<String> getComplaints() {
        return complaints;
    }
    public void assignComplaint(String complaint) {
        complaints.add(complaint);
    }
    public List<String> getMessages() {
        return messages;
    }
}
