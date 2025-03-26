package Person;

public class Employee extends Person { //lớp con kế thừa của lớp cha
	double salary;
	
	Employee(String n, int a, double s){
		super(n,a);
		salary = s;
	}
	
	public String getDetail() {
		String s = super.getDetail() + ", " + this.salary; 
		//tái sử dụng đoạn mã của lớp cha, mà ko phải overriding
		//gọi cho các method của lớp cha
		return s;
	}
}
