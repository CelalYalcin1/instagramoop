package instagramoop;

public class Account {
		
	private String accountName;
	private String pasword;
	private String description;
	private String profileImage;
	private int numberOfFollowers;
	private int numberOfFollowings;
	
	
	
	public Account() {
		super();
		
	}


	public Account(String accountName, String pasword, String description, String profileImage, int numberOfFollowers,
			int numberOfFollowings) {
		super();
		this.accountName = accountName;
		this.pasword = pasword;
		this.description = description;
		this.profileImage = profileImage;
		this.numberOfFollowers = numberOfFollowers;
		this.numberOfFollowings = numberOfFollowings;
	}
	
	//Followup access
	public Account(String accountName, String description, String profileImage, int numberOfFollowers,
			int numberOfFollowings) {
		super();
		this.accountName = accountName;
		this.description = description;
		this.profileImage = profileImage;
		this.numberOfFollowers = numberOfFollowers;
		this.numberOfFollowings = numberOfFollowings;
	}
	
	//Sharing and Shopping access
	public Account(String accountName, String profileImage) {
		super();
		this.accountName = accountName;
		this.profileImage = profileImage;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		accountName = accountName;
	}


	public String getPasword() {
		return pasword;
	}


	public void setPasword(String pasword) {
		this.pasword = pasword;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}


	public int getNumberOfFollowers() {
		return numberOfFollowers;
	}


	public int getNumberOfFollowings() {
		return numberOfFollowings;
	}
	
	
}
