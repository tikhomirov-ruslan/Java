package system;

import java.util.ArrayList;
import java.util.List;

public class LogManager {
    private List<String> actions;

    public LogManager() {
        actions = new ArrayList<>();
    }

    public List<String> getActions() {
        return actions;
    }

    public void addAction(String action) {
        actions.add(action);
    }

}
