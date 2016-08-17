import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Helper {

	 static List<Page> pages = new ArrayList<>();
	 static List<Post> posts = new ArrayList<>();
	
	
	 public static void addPage(Page page){
		 
		 pages.add(page);
		 
	 }
	 
	 public static void addPost(Post post){
		 
		 posts.add(post);
		 
	 }
	 
	 public static void addComment(int index, Comment comment){
		 
		 posts.get(index).addComment(comment);
	 }
	 
	 public static void showPages(){
		 
		 
	 }
	 
	 public static void showPost(){
		 
		 
	 }

}
