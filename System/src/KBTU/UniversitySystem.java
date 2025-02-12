package KBTU;

import java.util.Scanner;

public class UniversitySystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите логин: ");
		String login = scanner.nextLine();

	    System.out.print("Введите пароль: ");
	    String password = scanner.nextLine();

	    String role = authenticate(login, password);

	    if (role != null) 
	    {
	    	System.out.println("Аутентификация успешна. Роль: " + role);
	        performActionsBasedOnRole(role);
	    } 
	    
	    else 
	    {
	    	System.out.println("Ошибка аутентификации. Проверьте логин и пароль.");
	    }
	}

	
	private static String authenticate(String login, String password) {
		
		if ("student".equals(login) && "student".equals(password)) 
		{
			return "Ученик";
	    } 
		else if ("teacher".equals(login) && "teacher".equals(password)) 
		{
			return "Учитель";
	    } 
		else if ("admin".equals(login) && "admin".equals(password)) 
		{
	        return "Админ";
	    } 
		else if ("manager".equals(login) && "manager".equals(password)) 
		{
	        return "Мэнэнджер";
	    }
		
		return null;
	}

	
	private static void performActionsBasedOnRole(String role) {
//		Manager
		NewsManager newsManager = new NewsManager();
        Scanner scanner = new Scanner(System.in);
        
//		Teacher
		Teacher teacher = new Teacher("Джумадильдаев А.С.", "Professor ");
		
		teacher.createCourse("Дискретные структуры");
		teacher.createCourse("Физика");
		
		Student student1 = new Student("Тихомиров Руслан Юрьевич", 1);
		Student student2 = new Student("fff", 2);
		
		teacher.addStudentToCourse(student1, teacher.getCourses().get(0));
		teacher.addStudentToCourse(student2, teacher.getCourses().get(1));
		
		teacher.assignGrade(student1, teacher.getCourses().get(0), "C");
		teacher.assignGrade(student2, teacher.getCourses().get(1), "B");
		
		switch (role) 
		{
			case "Ученик":
//				Логика для ученика
				System.out.println("Действия ученика: "
								 + "♦ Просмотр курсов\r\n"
								 + "♦ Регистрация на курсы\r\n"
								 + "♦ Просмотр оценок\r\n"
								 + "♦ Новости");
				
				System.out.println("Учитель: " + teacher.getRankName() + " " + teacher.getTeacherName());
		        for (Course course : teacher.getCourses()) {
		            System.out.println("Курс: " + course.getCourseName());
		            for (Student student : course.getStudents()) {
		                System.out.println("Ученик: " + student.getStudentName() + ", Оценка: " +
		                        student.getGrades().get(course.getCourseName()));                                                   
		            }
		        }
				
				while (true) 
				{
	                String input = scanner.nextLine();
				
	                if ("Новости".equalsIgnoreCase(input)) 
	                {
	                	newsManager.printAllNews();
	                }
	                
	                else if (input.equalsIgnoreCase("exit")) {
	                    System.out.println("Exiting the program.");
	                    break;
	                }
				}
				
		        
//				break;
				
			case "Учитель":
//	            Логика для учителя
				System.out.println("Действия учителя: \r\n"
								 + "♦ Просмотр и управление курсами, просмотр студентов(инфо)\r\n"
								 + "♦ Просмотр и постановка оценок\r\n"
								 + "♦ Общение с другими преподавателями");
	            break;
	            
	        case "Админ":
	             // Логика для админа
	        	System.out.println("Действия админа: \r\n"
	        					 + "♦ Управление пользователями (добавление, удаление, обновление)\r\n"
	        					 + "♦ Просмотр файлов журналов о действиях пользователя");
	        	break;
	        	
	        case "Мэнэнджер":
	             // Логика для менеджера
	        	System.out.println("Действия менеджера: \r\n"
	        					 + "♦ Одобрить регистрацию студентов\r\n"
	        					 + "♦ Добавить курсы для регистрации\r\n"
	        					 + "♦ Управление новостями\r\n"
	        					 + "♦ Просмотр информации об учениках и преподавателях");
	        	
	        	while (true) {
	        		
	                System.out.println("Введите новость или 'новости' для вывода всех новостей:");
	                String input = scanner.nextLine();

	                if ("Новости".equalsIgnoreCase(input)) 
	                {
	                    newsManager.printAllNews();
	                } 
	                
	                else if (input.equalsIgnoreCase("exit")) 
	                {
	                    System.out.println("Exiting the program.");
	                    break;
	                }
	                
	                else 
	                {
	                    newsManager.addNews(input);
	                }
	                
	            }
//	            break;
	            
	        default:
	        	System.out.println("Неизвестная роль.");
	    }

		
		
//		Teacher teacher = new Teacher("Джумадильдаев А.С.", "Professor ");
//		
//		teacher.createCourse("Дискретные структуры");
//		teacher.createCourse("Физика");
//		
//		Student student1 = new Student("Тихомиров Руслан Юрьевич", 1);
//		Student student2 = new Student("fff", 2);
//		
//		teacher.addStudentToCourse(student1, teacher.getCourses().get(0));
//		teacher.addStudentToCourse(student2, teacher.getCourses().get(1));
//		
//		teacher.assignGrade(student1, teacher.getCourses().get(0), "C");
//		teacher.assignGrade(student2, teacher.getCourses().get(1), "B");
//		
//		System.out.println("Учитель: " + teacher.getRankName() + teacher.getName());
//        for (Course course : teacher.getCourses()) {
//            System.out.println("Курс: " + course.getCourseName());
//            for (Student student : course.getStudents()) {
//                System.out.println("Ученик: " + student.getName() + ", Оценка: " +
//                        student.getGrades().get(course.getCourseName()));                                                   
//            }
//        }
        
	}
}
