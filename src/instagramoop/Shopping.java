package instagramoop;

public class Shopping extends Account {
	
	private String productName;
	private String shoppingLink;
	private String details;
	private String explanation;
	private double unitPrice;
	private double discount;
	private double discountedPrice;
	private String[] image;
	
		
	public Shopping() {
		super();
	}
	public Shopping(String productName, String shoppingLink, String details, String explanation, double unitPrice,
			double discount, double discountedPrice, String[] image) {
		super();
		this.productName = productName;
		this.shoppingLink = shoppingLink;
		this.details = details;
		this.explanation = explanation;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.discountedPrice = discountedPrice;
		this.image = image;
	}
	
	public Shopping(String accountName, String profileImage) {
		super(accountName, profileImage);
		// TODO Auto-generated constructor stub
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getShoppingLink() {
		return shoppingLink;
	}
	public void setShoppingLink(String shoppingLink) {
		this.shoppingLink = shoppingLink;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String[] getImage() {
		return image;
	}
	public void setImage(String[] image) {
		this.image = image;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	
	
	

	
	
}
