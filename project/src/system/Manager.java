package system;

import java.util.*;

public class Manager {
    private String managerName;
    private List<String> news;

    public Manager(String managerName) {
        this.managerName = managerName;
        this.news = new ArrayList<>();
    }

    public String getManagerName() {
        return managerName;
    }

    public void addCourse(String courseName) {

    }

    public void addRegistrationToCourse(String courseName, String studentID) {

    }

    public void addNews(String newsItem) {
        news.add(newsItem);
    }

    public void printAllNews() {
        for (String item : news) {
            System.out.println(item);
        }
    }

    public void getRegistrationStudent() {

    }

    public void getCourseAssignment() {

    }
    public void assignCourse(String courseName, String teacherID) {
    }

}
