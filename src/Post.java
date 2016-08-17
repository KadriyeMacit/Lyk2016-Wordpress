import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public abstract class Post extends Page{

	public Post(String title, String body, String category) {
		super(title, body, category);
		
	}
	

	private List<Comment> comments = new ArrayList<>();
	
	
	public Iterator<Comment> getComments(){
		
		return this.comments.iterator();
	}
	
	
	public void addComment(Comment comments){
		
		this.comments.add(comments);
	}

}
