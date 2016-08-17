
public class TextPost extends Post{
	
	private String summary;
	//summary first 10 char

	
	public TextPost(String title, String body, String category) {
		super(title, body, category);
		this.summary=this.getBody().substring(0,11);
	}

	
	public String getSummary() {
		return summary;
	}

	
	
}
