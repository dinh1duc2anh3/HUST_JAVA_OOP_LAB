package Person;

public class Person {
	protected String name;
	protected int age;
	
	Person(String n, int a){
		name = n;
		age = a;
	}
	
	public String getDetail() {
		String s = this.name + ", " + this.age;  //this để chỉ tới object hiện tại
		return s;
	}
}
