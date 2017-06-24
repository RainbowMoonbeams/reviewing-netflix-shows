package reviewpackage;

public class Review {

	private long id;
	private String title;
	private String imageUrl;
	private String category;
	private int year;
	private String content;
	private String myReview;

	public Review(long id, String title, String imageUrl, String category, int year) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.year = year;
		this.content = content;
		this.myReview = myReview;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void setCategory(String reviewCategory) {
		this.category = reviewCategory;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public void setMyReview(String myReview) {
		this.myReview = myReview;
	}

	public String getMyReview() {
		return myReview;
	}

	@Override
	public String toString() {
		return (title + category + imageUrl + content);
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
}
