public class ClassStudy{
    public static void main(String[] args){
        String name = "";
        Cat RussianBlue = new Cat();
        RussianBlue.setCat("����",3,"Ĺ��");
        RussianBlue.eat();        
    }
}
class Cat{
    
	String name;
	int age;
	String favorite;
	
	public void setCat(String name, int age, String favorite){
	this.name = name;
	this.age = age;
	this.favorite = favorite;
	}
	
    void eat(){ // �޼ҵ� ����
        System.out.println(this.age + "�� " + this.name + "�� "
                           + this.favorite + "�� �Ծ���.");
    }
}