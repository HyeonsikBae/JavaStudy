
public class Constructor {
	public static void main(String[] args) {
		smartphone myPhone = new smartphone("노트10",1080000);
		myPhone.vendor = "삼성";
		
		myPhone.view();
	}
}
class smartphone{
	String vendor;
	String kind;
	String number;
	int price;
	
	public smartphone(String kind,int price) {
		this.kind = kind;
		setPrice(price);
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void view() {
		System.out.println("벤더 : " + this.vendor + "\n" + 
						   "기종 : " + this.kind + "\n" + 
						   "번호 : " + this.number + "\n" + 
						   "가격 : " + this.price + "\n");
	}
}
