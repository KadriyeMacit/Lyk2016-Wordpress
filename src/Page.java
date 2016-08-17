import java.time.LocalDate;


public class Page {

	private String title;
	private String body;
	private String category;
	private LocalDate date;
	//Set comments;
	
	public Page(String title, String body, String category){
		
		this.title=title;
		this.body=body;
		this.category=category;
		this.date=LocalDate.now();
		
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
