package Chapter5.Homework1;

public class Book {
	private String title;
	private String author;
	private int publishYear;
	private boolean isBorrowed = true;
	
	public  Book(String title , String author,int publishYear) {
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
		
	
	}
	public void borrow() {
		isBorrowed = true;
	}
	public void returnBack() {
		isBorrowed = false;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	public String toString() {
		String result ;
		if(isBorrowed) {
			result = "Not available to Borrow";
		}else {
			result = "Available to Borrow";
		}
		return "Title: "+"\n"+title + "\n"+" by "+author + "-- published "+publishYear +"\n"+" Status: "+result;
		
	}
	
	
}
