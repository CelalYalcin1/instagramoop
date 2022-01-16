package instagramoop;

public class Post extends Sharing{
	
	private String [] Savings;
	private String explanation;
	
	public Post() {
		super();
	}
	
	public Post(String[] savings, String explanation) {
		super();
		this.Savings = savings;
		this.explanation = explanation;
	}


	public Post(String accountName, String profileImage) {
		super(accountName, profileImage);
		// TODO Auto-generated constructor stub
	}

	public Post(String[] comments, int numberOfLikes, String[] medias, String location, String mention) {
		super(comments, numberOfLikes, medias, location, mention);
		// TODO Auto-generated constructor stub
	}

	public String[] getSavings() {
		return Savings;
	}

	public void setSavings(String[] savings) {
		Savings = savings;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	

	
	
	
}
