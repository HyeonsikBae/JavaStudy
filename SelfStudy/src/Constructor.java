
public class Constructor {
	public static void main(String[] args) {
		smartphone myPhone = new smartphone("��Ʈ10",1080000);
		myPhone.vendor = "�Ｚ";
		
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
		System.out.println("���� : " + this.vendor + "\n" + 
						   "���� : " + this.kind + "\n" + 
						   "��ȣ : " + this.number + "\n" + 
						   "���� : " + this.price + "\n");
	}
}
