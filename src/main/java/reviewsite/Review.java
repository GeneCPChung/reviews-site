package reviewsite;

public class Review {

	private long id;
	private String title;
	private String images;
	private String category;
	private String content;

	public Review(long id, String title, String images, String content, String category) {
		super();
		this.id = id;
		this.title = title;
		this.images = images;
		this.category = category;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
