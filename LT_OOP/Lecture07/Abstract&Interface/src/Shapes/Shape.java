package Shapes;

public abstract class Shape { 
	//là 1 lớp abstract, ko trực tiếp tạo ra 1 đối tượng nào cả ( lớp trừu tượng )
	//	ko cho kết hợp abstract private / abstract static / abstract final mà chỉ cho abstract protected hoặc public
	protected String name;
	
	protected Shape(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public abstract double calculateArea();
	// method abstract ( phương thức trừu tượng ) thì sẽ ko được specify phần thân hàm ( nghĩa là ko có phần {} sau () ) 
}



