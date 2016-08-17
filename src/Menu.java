import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Menu {

public static void printMenu(){
		
		StringBuilder menu = new StringBuilder(50);
		
		
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(1) Add Page\n");
		menu.append("(2) Add Post\n");
		menu.append("(3) Add Comment\n");
		menu.append("(4) Show Pages\n");
		menu.append("(4) Show Post\n");
		menu.append("\n");
		menu.append("Enter your command: ");
		
			
		System.out.println(menu.toString());
	}



public static void printPostMenu(){
	
	StringBuilder menu = new StringBuilder(50);
	
	
	menu.append("ADD POST\n");
	menu.append("=====\n");
	menu.append("(1) Add VideoPost\n");
	menu.append("(2) Add TextPost\n");
	menu.append("(3) Back Menu");
	menu.append("\n");
	menu.append("Enter your command: ");
	
		
	System.out.println(menu.toString());
	
}

public static void printCommentMenu(){
	
StringBuilder menu = new StringBuilder(50);
	
	
	menu.append("ADD COMMENT\n");
	menu.append("=====\n");
	menu.append("(1) List Comment\n");
	menu.append("(2) Add Comment\n");
	menu.append("(3) Back Menu");
	menu.append("\n");
	menu.append("Enter your command: ");
	
	
		
	System.out.println(menu.toString());
	
	
}

public static void printPagesMenu() {
	
	StringBuilder menu = new StringBuilder();
	
	//Iterator<Page> itPages = Helper.showPages();
	
	int index = 1;

	menu.append("PAGES\n");
	menu.append("============\n");
	
//	while (itPages.hasNext()) {
//		
//		Page currentPage = itPages.next();
//		menu.append(index++);
//		menu.append("-) ");
//		menu.append(currentPage.getTitle());
//		menu.append(" - Category: ");
//		menu.append(currentPage.getCategory());
//		menu.append(" - ");
//		menu.append(currentPage.getDate());
//		menu.append("\n");
//		menu.append(currentPage.getBody());
//		menu.append("\n---------------------\n");
//		
//	}
//	
//	System.out.println(menu);

}



}
        