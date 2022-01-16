package instagramoop;

public class Followers extends FollowUp {
	
	private String [] followers;

	
	public Followers() {
		super();
	}


	public Followers(String[] followers) {
		super();
		this.followers = followers;
	}


	public String[] getFollowers() {
		return followers;
	}


	public void setFollowers(String[] followers) {
		this.followers = followers;
	}
	
	
}
