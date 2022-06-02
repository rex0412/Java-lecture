package data;

public class Movie {
	
		
	private String title;
	private int price;
	private String author;
	private int level;
	private int time;
	
	public Movie(String title, int price, String author, int level, int time) {
		this.title = title;
		this.price = price;
		this.author = author;
		this.level = level;
		this.time = time;
	}
	
	public Movie() {
		
	}
	
	public Movie(String title, int price) {
		this(title, price, "", 0, 0);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", price=" + price + ", author=" + author + ", level=" + level + ", time="
				+ time + "]";
	}
	
	

}
