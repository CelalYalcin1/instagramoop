package instagramoop;

public class CommunityAccount extends Account {
	
	private String CommunityName;
	private String CommunitySurname;
	
	public CommunityAccount() {
		super();
	}
	
	public CommunityAccount(String communityName, String communitySurname) {
		super();
		this.CommunityName = communityName;
		this.CommunitySurname = communitySurname;
	}

	public String getCommunityName() {
		return CommunityName;
	}

	public void setCommunityName(String communityName) {
		CommunityName = communityName;
	}

	public String getCommunitySurname() {
		return CommunitySurname;
	}

	public void setCommunitySurname(String communitySurname) {
		CommunitySurname = communitySurname;
	}
	
	
	
}
