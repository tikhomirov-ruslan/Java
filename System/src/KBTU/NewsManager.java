package KBTU;

import java.util.*;

public class NewsManager {
	
	private List<String> newsList;

	public NewsManager()
	{
		this.newsList = new ArrayList<>();
	}
	
	public void addNews(String news) {
        newsList.add(news);
        System.out.println("Новость добавлена успешно!");
    }

    public void printAllNews() 
    {
        if (newsList.isEmpty()) 
        {
            System.out.println("Нет доступных новостей.");
        } 
        else 
        {
            System.out.println("Все новости:");
            for (String news : newsList) 
            {
                System.out.println(news);
            }
        }
    }
}
