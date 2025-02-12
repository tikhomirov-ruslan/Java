package system;

import java.util.*;

public class NewsManager {
    private List<String> news;
    public NewsManager() {
        this.news = new ArrayList<>();
    }
    public void addNews(String newsItem) {
        news.add(newsItem);
    }
    public void printAllNews() {
        for (String item : news) {
            System.out.println(item);
        }
    }
}
