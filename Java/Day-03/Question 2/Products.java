package Day3_4;

public class Products {
	int prdId;
	String prdName;
	int prdPrice;
	Products (int prdId,String prdName,int prdPrice){
		this.prdId=prdId;
		this.prdName=prdName;
		this.prdPrice=prdPrice;
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
	@Override
	public String toString() {
		return "Products [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	
	
}
