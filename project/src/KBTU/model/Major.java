package KBTU.model;

import java.io.Serializable;
import java.util.List;

public class Major implements Serializable {
    private String majorId;
    private String majorName;

    public Major(String majorId, String majorName) {
        this.majorId = majorId;
        this.majorName = majorName;
    }

    public String getMajorId() {
        return majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorId='" + majorId + '\'' +
                ", majorName='" + majorName + '\'' +
                '}';
    }
}
