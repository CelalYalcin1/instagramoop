package instagramoop;

public class Story extends Sharing {
	
	private String [] quickReactionEmojies;
	private String [] answer;
	
	public Story() {
		super();
	}
	public Story(String[] quickReactionEmojies, String[] answer) {
		super();
		this.quickReactionEmojies = quickReactionEmojies;
		this.answer = answer;
	}
	
	
	public Story(String accountName, String profileImage) {
		super(accountName, profileImage);
		// TODO Auto-generated constructor stub
	}
	public Story(String[] comments, int numberOfLikes, String[] medias, String location, String mention) {
		super(comments, numberOfLikes, medias, location, mention);
		// TODO Auto-generated constructor stub
	}
	
	
	public String[] getQuickReactionEmojies() {
		return quickReactionEmojies;
	}
	public void setQuickReactionEmojies(String[] quickReactionEmojies) {
		this.quickReactionEmojies = quickReactionEmojies;
	}
	public String[] getAnswer() {
		return answer;
	}
	public void setAnswer(String[] answer) {
		this.answer = answer;
	}
	
	
}
