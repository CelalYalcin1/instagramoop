package instagramoop;

public class Reels extends Sharing{
	
	private String [] fonMusics;
	private String explanation;
	
	
	public Reels() {
		super();
	}

	public Reels(String[] fonMusics, String explanation) {
		super();
		this.fonMusics = fonMusics;
		this.explanation = explanation;
	}
	
	
	public Reels(String accountName, String profileImage) {
		super(accountName, profileImage);
		// TODO Auto-generated constructor stub
	}

	public Reels(String[] comments, int numberOfLikes, String[] medias, String location, String mention) {
		super(comments, numberOfLikes, medias, location, mention);
		// TODO Auto-generated constructor stub
	}

	public String[] getFonMusics() {
		return fonMusics;
	}
	public void setFonMusics(String[] fonMusics) {
		this.fonMusics = fonMusics;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	
	
}
