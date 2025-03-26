package Shapes;

public class main {

	public static void main(String[] args) {
		//muốn tạo ra đối tượng mới thì cần phải sử dụng từ khóa new
		Circle hinh_tron = new Circle("hinh tron",4.0);
		System.out.println( hinh_tron.calculateArea() );
		
	}

}
