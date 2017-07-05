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

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public int getYear() {
		return year;
	}

	public String getContent() {
		return content;
	}

	public String getMyReview() {
		return myReview;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setMyReview(String myReview) {
		this.myReview = myReview;
	}

	@Override
	public String toString() {
		return (title + category + imageUrl + content);
	}
}
