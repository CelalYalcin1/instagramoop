package instagramoop;

public class Sharing extends Account {
	
	private String [] comments;
	private int numberOfLikes;
	private String [] medias;
	private String location;
	private String mention;
	
	
	public Sharing() {
		super();
	}
	public Sharing(String[] comments, int numberOfLikes, String[] medias, String location, String mention) {
		super();
		this.comments = comments;
		this.numberOfLikes = numberOfLikes;
		this.medias = medias;
		this.location = location;
		this.mention = mention;
	}
	
	public Sharing(String accountName, String profileImage) {
		super(accountName, profileImage);
		// TODO Auto-generated constructor stub
	}
	
	public String[] getComments() {
		return comments;
	}
	public void setComments(String[] comments) {
		this.comments = comments;
	}
	public String[] getMedias() {
		return medias;
	}
	public void setMedias(String[] medias) {
		this.medias = medias;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMention() {
		return mention;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	public int getNumberOfLikes() {
		return numberOfLikes;
	}
	
	
}
