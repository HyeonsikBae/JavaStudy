public class ClassStudy{
    public static void main(String[] args){
        String name = "";
        Cat RussianBlue = new Cat();
        RussianBlue.setCat("°í¿µÈñ",3,"Ä¹´Ø");
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
	
    void eat(){ // ¸Þ¼Òµå »ý¼º
        System.out.println(this.age + "»ì " + this.name + "´Â "
                           + this.favorite + "¸¦ ¸Ô¾ú´Ù.");
    }
}